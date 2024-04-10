public class problem {

    public static  class matamatik
    {
    public static void  daire_alanı(int yarıcap)
    {
        System.out.println("dairenin alanı : "+(yarıcap*yarıcap*Math.PI));
    }
    public static void ucgenin_cevresi(int kenar1,int kenar2, int kenar3)
    {
        System.out.println("üçgenin çevresi : "+(kenar2+kenar3+kenar1));
    }

    }
    public static class fizik
    {
        public static void İcCarpım(Vec vec1,Vec vec2)
        {
            int iccarpım=vec1.getI()*vec2.getI()+vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK();

            System.out.println(vec1.getIsim()+" ile "+vec2.getIsim()+" iççarpımı :"+iccarpım);
        }

    }
}
