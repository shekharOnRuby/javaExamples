//2-2: Truth table for logical operators
class LogicalOpTable{
  public static void main (String [] args){
    boolean p,q;
    int pInt, qInt, pANDq, pORq, pXORq, notP;
    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

    p = true;q = true;

    pInt = p ? 1:0;
    qInt = q ? 1:0;

    pANDq = (p&q) ? 1:0;
    pORq = (p|q) ? 1:0;
    pXORq = (p^q) ? 1:0;
    notP = !(p) ? 1:0;

    System.out.print(pInt + "\t" + qInt +"\t");
    System.out.print(pANDq+"\t"+pORq+"\t");
    System.out.println(pXORq+"\t"+notP);


    p = true;q = false;

        pInt = p ? 1:0;
        qInt = q ? 1:0;

        pANDq = (p&q) ? 1:0;
        pORq = (p|q) ? 1:0;
        pXORq = (p^q) ? 1:0;
        notP = !(p) ? 1:0;

        System.out.print(pInt + "\t" + qInt +"\t");
        System.out.print(pANDq+"\t"+pORq+"\t");
        System.out.println(pXORq+"\t"+notP);
    p = false;q = true;

        pInt = p ? 1:0;
        qInt = q ? 1:0;

        pANDq = (p&q) ? 1:0;
        pORq = (p|q) ? 1:0;
        pXORq = (p^q) ? 1:0;
        notP = !(p) ? 1:0;

        System.out.print(pInt + "\t" + qInt +"\t");
        System.out.print(pANDq+"\t"+pORq+"\t");
        System.out.println(pXORq+"\t"+notP);
    p = false;q = false;

        pInt = p ? 1:0;
        qInt = q ? 1:0;

        pANDq = (p&q) ? 1:0;
        pORq = (p|q) ? 1:0;
        pXORq = (p^q) ? 1:0;
        notP = !(p) ? 1:0;

        System.out.print(pInt + "\t" + qInt +"\t");
        System.out.print(pANDq+"\t"+pORq+"\t");
        System.out.println(pXORq+"\t"+notP);
  }
}
