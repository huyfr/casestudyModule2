package interfaceFunction;

import common.Common;

public interface Controller {
    public abstract String search(String key, Common common);
    public abstract boolean add(String content, Common common);
    public abstract boolean edit(String lineToEdit, String content, Common common);
    public abstract boolean delete(String key, Common common);
}