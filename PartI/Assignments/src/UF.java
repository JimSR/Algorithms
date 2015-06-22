/**
 * Created with IntelliJ IDEA.
 * User: jimr
 * Date: 20-6-15
 * Time: 9:42
 * To change this template use File | Settings | File Templates.
 */
public abstract class UF {

    protected int[] id;

    public UF(int N) {
        id = new int[N];
        for (int i =0; i < N;i++)
            id[i] = i;
    }

    public abstract boolean connected(int p, int q);

    public abstract void union(int p, int q) ;

    @Override
    public String toString() {
        String str = "id: ";
         for(int i = 0; i < id.length; i++)
             str += id[i] + " ";
        return str;
    }
}
