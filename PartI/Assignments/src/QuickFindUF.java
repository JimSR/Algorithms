/**
 * Created with IntelliJ IDEA.
 * User: jimr
 * Date: 21-6-15
 * Time: 10:03
 * To change this template use File | Settings | File Templates.
 */
public class QuickFindUF extends UF {

    public QuickFindUF(int N) {
        super(N);
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int idP = id[p];
        int idQ = id[q];

        for(int i = 0; i < id.length;i++){
            if(id[i] == idP)
                id[i] = idQ;
        }
    }
}
