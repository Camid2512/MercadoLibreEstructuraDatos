package co.edu.unbosque.model.persistence;

public interface CRUDOperation {

	public void create(Object obj);

	public String read();

	public boolean updateByIndex(int index, String... args);

	public boolean deleteByIndex(int index);

	public void writeFile();

	public void writeSerializable();

}
