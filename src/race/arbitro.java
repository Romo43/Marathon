package race;

public class arbitro implements Runnable{

    Thread T1, T2,T3,T4,T5,T6,T7,T8,T9,T10;

    public static int lug;
    int[] matriz = new int[10];
    String[] lugar = new String[10];
    public static String[] estado = new String[10];



    public void run() {
        // Espacio que no interfiere en nada


        // Fin del espacio
        while (lug != 10) {

            if (this.search((int) T1.getId(), this.lug)) {
                this.IsAliveD(this.T1, this.lug);
            }

            if (this.search((int) T2.getId(), this.lug)) {
                this.IsAliveD(this.T2, this.lug);
            }

            if (this.search((int) T3.getId(), this.lug)) {
                this.IsAliveD(this.T3, this.lug);
            }

            if (this.search((int) T4.getId(), this.lug)) {
                this.IsAliveD(this.T4, this.lug);
            }

            if (this.search((int) T5.getId(), this.lug)) {
                this.IsAliveD(this.T5, this.lug);
            }

            if (this.search((int) T6.getId(), this.lug)) {
                this.IsAliveD(this.T6, this.lug);
            }

            if (this.search((int) T7.getId(), this.lug)) {
                this.IsAliveD(this.T7, this.lug);
            }

            if (this.search((int) T8.getId(), this.lug)) {
                this.IsAliveD(this.T8, this.lug);
            }

            if (this.search((int) T9.getId(), this.lug)) {
                this.IsAliveD(this.T9, this.lug);
            }

            if (this.search((int) T10.getId(), this.lug)) {
                this.IsAliveD(this.T10, this.lug);
            }


        }

        Cambio();
        Burbuja(estado, lugar);
        tabla_ranking();

    }
/*
    public void Ordenar(){
        for (int i= 0; i<=10; i++){

            if(estado[i]=="Abandono"){
                estado[i] = estado[i+1];
            }else {

            }

        }
    }
*/

    public void tabla_ranking(){
        int aux=0;

        System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*");
        for(int i = 0;i<=9;i++){
            aux = aux + 1;
            System.out.println("[ " + aux + " ]" + lugar[i] + " " + estado[i]);
        }
        System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*");
    }

    public void Cambio(){
        for(int i = 0; i <= 9; i++){
            if(estado[i]==null){
                estado[i] = "0";            }
        }
    }

    public void Burbuja(String[] array, String[] corredor){
        String var;
        String Runner;

        for(int i=0; i < 9-1 ;i++){
            for(int j=9; j > 0;j--){
                if(Integer.parseInt(array[j]) > Integer.parseInt(array[j-1])){
                    var = array[j];
                    Runner = corredor[j];
                    array[j] = array [j-1];
                    corredor[j] = corredor [j-1];
                    array[j-1] = var;
                    corredor[j-1] = Runner;
                }
            }
        }

        for(int i=0;i<=9;i++){
            if(array[i]=="0"){
                array[i] = "Abandono";
            }else {
                array[i]= "Terminado";
            }
        }

    }

    public arbitro(Thread H1, Thread H2, Thread H3, Thread H4, Thread H5, Thread H6, Thread H7, Thread H8, Thread H9, Thread H10){
        this.T1 = H1;
        this.T2 = H2;
        this.T3 = H3;
        this.T4 = H4;
        this.T5 = H5;
        this.T6 = H6;
        this.T7 = H7;
        this.T8 = H8;
        this.T9 = H9;
        this.T10 = H10;
    }

    public void IsAliveD(Thread hilo, int number){
        if (!hilo.isAlive()) {
            this.matriz[this.lug] = (int) hilo.getId();
            this.lugar[this.lug] = hilo.getName();
            this.lug++;

        }

    }

    boolean search(int pos, int var){
        for(int i=0; i < var;i++){
            if (this.matriz[i] == pos) {
                return false;
            }
        }
        return true;
    }

}
