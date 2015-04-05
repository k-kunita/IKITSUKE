package jp.co.ikitsuke.aopTest;

public interface IMyBean<T> {
	public void setDataObject(T obj);
	public T getDataObject();
	public void addData(Object obj);
	public String toString();
}
