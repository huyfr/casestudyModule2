package controller;

import common.Common;
import constant.Regex;
import service.Service;

public class Controller {

    Service service = new Service();

    Common common = new Common();

    public void init() {
        String srcPath = common.getDestinationPath() + common.getVersion() + Regex.DOT_TXT;
        common.setDictionary(common.pushTextToHashMap(srcPath));
    }

    public String search(String key) {
        String result = service.search(key, common);
        return result;
    }

    public boolean add(String content) {
        boolean statusOfAdd = service.add(content, common);
        return statusOfAdd;
    }

    public boolean edit(String lineToEdit, String content) {
        boolean statusOfEdit = service.edit(lineToEdit, content, common);
        return statusOfEdit;
    }

    public boolean delete(String key) {
        boolean statusOfDelete = service.delete(key, common);
        return statusOfDelete;
    }
}
