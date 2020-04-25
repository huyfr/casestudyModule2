package common;

import constant.Regex;
import constant.Error;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;

public class Common {

    //folder length
    File file = new File("G:\\codegym\\module2\\Casestudy_Module2\\fileTxt");
    private int version = file.list().length;

    //path
    private String sourcePath = "G:\\codegym\\module2\\Casestudy_Module2\\fileTxt\\EN_VN_" + String.valueOf(version) + ".txt";
    private String destinationPath = "G:\\codegym\\module2\\Casestudy_Module2\\fileTxt\\EN_VN_";

    public int getLengthFile() {
        return file.list().length;
    }

    public int getVersion() {
        return version;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public String getDestinationPath() {
        return destinationPath;
    }

    public void increaseVersion(int version) {
        this.version += version;
    }

    //create hash map
    HashMap<String, String> dictionary;

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    //read file text then push to hash map    
    public HashMap<String, String> pushTextToHashMap(String path) {
        dictionary = new HashMap<>();
        File fileCurrentVersion;
        FileReader fr;
        BufferedReader br = null;
        String fullLine, key, value;
        String[] currentLine, word, pronunciation;
        System.out.println(path);

        try {
            fileCurrentVersion = new File(path);
            fr = new FileReader(fileCurrentVersion);
            br = new BufferedReader(fr);
            while ((fullLine = br.readLine()) != null) {
                if (fullLine.startsWith(Regex.DELETE_COMMENT) && fullLine.endsWith(Regex.DELETE_COMMENT)) {
                    continue;
                } else {
                    //reset
                    value = Regex.BLANK;

                    currentLine = fullLine.split(Regex.BACK_SLASH_N_IN_FILE);
                    word = currentLine[0].split(Regex.BACK_SLASH_TAB_IN_FILE);
                    key = word[0];

                    value = Regex.NEW_LINE;

                    //pronounciation
                    pronunciation = word[1].split(Regex.SPACE);
                    if (pronunciation.length > 1) {
                        if (pronunciation[1].equals(Regex.DOUBLE_FORWARD_SLASH)) {
                            value += Regex.BLANK;
                        } else {
                            value += pronunciation[1] + Regex.NEW_LINE;
                        }
                    } else {
                        value += Regex.BLANK;
                    }

                    //meaning and specialized
                    for (int i = 1; i < currentLine.length; i++) {
                        if (currentLine[i].startsWith(Regex.AT)) {
                            currentLine[i] = currentLine[i].substring(1);
                        } else if (currentLine[i].startsWith(Regex.ASTERISK) && currentLine[i].length() < 4) {
                            currentLine[i] = Regex.BLANK;
                        }
                        value += currentLine[i] + Regex.NEW_LINE;
                    }

                    //put to hashmap
                    dictionary.put(key, value);

                    //reset
                    resetStringArrays(currentLine, word);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println(Error.ERROR_001);
        } catch (IOException ex) {
            System.err.println(Error.ERROR_002);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.err.println(Error.ERROR_003);
            }
        }
        return dictionary;
    }

    //write content to file
    public void writeToFile(String destPath, String content) {
        try {
            Files.write(Paths.get(destPath), content.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException ex) {
            System.err.println(Error.ERROR_004);
        }
    }

    //copy file to new file
    public boolean copyToFile(String srcPath, String destPath) {
        File source;
        File destination = null;
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        int count;

        try {
            destination = new File(destPath);
            if (!destination.exists()) {
                destination.createNewFile();
            }
        } catch (IOException ex) {
            System.err.println(Error.ERROR_005);
        }

        try {
            source = new File(srcPath);
            fr = new FileReader(source);
            br = new BufferedReader(fr);
            fw = new FileWriter(destination);
            bw = new BufferedWriter(fw);
            while ((count = br.read()) != -1) {
                bw.write(count);
            }
            return true;
        } catch (IOException ex) {
            System.err.println(Error.ERROR_006);
            return false;
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.err.println(Error.ERROR_003);
            }
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                System.err.println(Error.ERROR_017);
            }
        }
    }

    //reset String arrays
    public void resetStringArrays(String[] currentLine, String[] wordLine) {
        try {
            java.util.Arrays.fill(currentLine, Regex.BLANK);
            java.util.Arrays.fill(wordLine, Regex.BLANK);
        } catch (Exception ex) {
            System.err.println(Error.ERROR_009);
        }
    }

    //display
    public void displayDictionary() {
        try {
            getDictionary().forEach((key, value) -> System.out.println(key + value));
        } catch (Exception ex) {
            System.err.println(Error.ERROR_010);
        }
    }

    //add <delete> to the beginning and end of words
    public boolean lineComment(String src, String dest, String lineToEdit) {
        File fileCurrentVersion, fileNewVersion = null;
        FileReader fr;
        FileWriter fw;
        BufferedReader br = null;
        BufferedWriter bw = null;
        String fullLine;
        String[] trimmedLine;
        int line = 0;

        try {
            fileNewVersion = new File(dest);
            if (!fileNewVersion.exists()) {
                fileNewVersion.createNewFile();
            }
        } catch (IOException ex) {
            System.err.println(Error.ERROR_005);
        }

        try {
            fileCurrentVersion = new File(src);
            fr = new FileReader(fileCurrentVersion);
            br = new BufferedReader(fr);
            fw = new FileWriter(fileNewVersion);
            bw = new BufferedWriter(fw);

            while ((fullLine = br.readLine()) != null) {
                trimmedLine = fullLine.split(Regex.TAB);
                if (trimmedLine[0].equals(lineToEdit)) {
                    if (line == 0) {
                        fullLine = Regex.DELETE_COMMENT + fullLine + Regex.DELETE_COMMENT;
                        bw.write(fullLine);
                        bw.flush();
                    } else {
                        fullLine = Regex.DELETE_COMMENT + fullLine + Regex.DELETE_COMMENT;
                        bw.write(Regex.NEW_LINE + fullLine);
                        bw.flush();
                    }
                } else {
                    if (line == 0) {
                        bw.write(fullLine);
                        bw.flush();
                    } else {
                        bw.write(Regex.NEW_LINE + fullLine);
                        bw.flush();
                    }
                }
                line++;
            }
            return true;
        } catch (IOException ex) {
            System.err.println(Error.ERROR_011);
            return false;
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                System.err.println(Error.ERROR_017);
            }
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.err.println(Error.ERROR_003);
            }
        }
    }
}
