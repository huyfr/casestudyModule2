package service;

import constant.Regex;
import constant.Error;
import common.*;
import interfaceFunction.Controller;
import java.util.HashMap;
import object.Words;

public class Service implements Controller {

    //search theo key
    @Override
    public String search(String key, Common common) {
        System.out.println(common.getVersion());
        String result = "";
        try {
            result = common.getDictionary().get(key);
        } catch (Exception ex) {
            System.err.println(Error.ERROR_013);
        }
        return result;
    }

//    add word to file
    @Override
    public boolean add(String content, Common common) {
        boolean statusOfAdd = true;
        common.increaseVersion(1);
        String destPath;
        try {
            destPath = common.getDestinationPath() + common.getVersion() + Regex.DOT_TXT;
            common.copyToFile(common.getSourcePath(), destPath);
            common.writeToFile(destPath, content);
        } catch (Exception ex) {
            System.err.println(Error.ERROR_014);
            statusOfAdd = false;
        }
        return statusOfAdd;
    }

    @Override
    public boolean edit(String lineToEdit, String content, Common common) {
        boolean statusOfEdit = true;
        common.increaseVersion(1);
        String destPath;
        try {
            destPath = common.getDestinationPath() + common.getVersion() + Regex.DOT_TXT;
            common.lineComment(common.getSourcePath(), destPath, lineToEdit);
            common.writeToFile(destPath, content);
        } catch (Exception ex) {
            System.err.println(Error.ERROR_015);
            statusOfEdit = false;
        }
        return statusOfEdit;
    }

    //delete a word in file
    @Override
    public boolean delete(String key, Common common) {
        boolean statusOfDelete = true;
        common.increaseVersion(1);
        String destPath;
        try {
            destPath = common.getDestinationPath() + common.getVersion() + Regex.DOT_TXT;
            common.lineComment(common.getSourcePath(), destPath, key);
        } catch (Exception ex) {
            System.err.println(Error.ERROR_016);
            statusOfDelete = false;
        }
        return statusOfDelete;
    }
}
