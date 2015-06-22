import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg;

/**
 * Created with IntelliJ IDEA.
 * User: jimr
 * Date: 20-6-15
 * Time: 9:44
 * To change this template use File | Settings | File Templates.
 */
public class DynamicConnectivityClient {

    public static void main(String... args) {
        int N = StdIn.readInt();
        UF uf = new QuickUnionUF(N);
        while(!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(!uf.connected(p,q)) {
                uf.union(p,q);
                StdOut.println(p + " " + q);
            }

            StdOut.println(uf);
        }


    }
}
