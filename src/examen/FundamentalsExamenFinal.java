package examen;

public class FundamentalsExamenFinal {
    public static void main(String[]args){
        /*String s="";
            String[] mountains = {"Chimborazo", "Matterhorn", "Olympus", "Everest", "Kinaba lu", "Adriondack", "Blue Ridge", "Zugspitze",};
                for (int i=0;i<mountains.length;i++)
                    s+=mountains[i].charAt(i);
                System.out.println(s.substring(2,4));
        String s ="abcdef";

        if(s.substring(0,3)=="abc")
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
        String s="\"\"\\\n\"";
        System.out.println(s);*/
        int [][] table=new int[3][3];
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table.length;j++){
                if(j==i)
                    table[i][j]=1;
                else
                    table[i][j]=0;
            }
        }
    }
}
