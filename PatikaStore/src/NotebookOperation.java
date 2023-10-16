import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotebookOperation {

    static Map<Integer, Notebook> notebookMap = new HashMap<>();

    void printNotebookOperation(List<Notebook> notebooks){
        for (Notebook notebook : notebooks){
            System.out.println("notebook adi");
        }
    }
    void addNotebookList(Notebook notebook){
        notebookMap.put(notebook.getIdNo(), notebook);
    }

    void deleteNotebook(int id){
        notebookMap.remove(id);
    }

    void run(){

    }
}
