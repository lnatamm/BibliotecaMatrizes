public class Matrix {

    private int linhas;

    private int colunas;

    private double[][] elementos;

    public Matrix(){

        this.linhas = 0;

        this.colunas = 0;

    }

    public Matrix(int linhas, int colunas, double[][] elementos){

        this.linhas = linhas;

        this.colunas = colunas;

        this.elementos = new double[this.linhas][this.colunas];

        for(int i = 0; i < this.linhas; i++){

            for(int j = 0; j < this.colunas; j++){

                this.elementos[i][j] = elementos[i][j];

            }

        }

    }

    public int getLinhas(){

        return this.linhas;

    }

    public int getColunas(){

        return this.colunas;

    }

    public double[][] getElementos(){

        return this.elementos;

    }

    public void setLinhas(int linhas){

        this.linhas = linhas;

    }

    public void setColunas(int colunas){

        this.colunas = colunas;

    }


    public void setElementos(double[][] elementos){

        this.elementos = elementos;

    }

    public double get(int i, int j){

        return this.elementos[i][j];

    }

    public void set(int i, int j, double elemento){

        this.elementos[i][j] = elemento;

    }

    public Vector getLine(int n){

        double[][] elementos = new double[this.linhas][1];

        for(int i = 0; i < 1; i++){

            for(int j = 0; j < this.colunas; j++){

                elementos[j][0] = this.elementos[n][j];

            }

        }

        Vector v = new Vector(this.linhas, elementos);

        return v;

    }

    public Vector getColumm(int n){

        double[][] elementos = new double[this.linhas][1];

        for(int i = 0; i < this.linhas; i++){

            for(int j = 0; j < 1; j++){

                elementos[i][0] = this.elementos[i][n];

            }

        }

        Vector v = new Vector(this.linhas, elementos);

        return v;

    }

    public Vector sumLines(){

        double[][] elementos = new double[this.linhas][1];

        double soma = 0;

        for(int i = 0; i < this.linhas; i++){

            for(int j = 0; j < this.colunas; j++) {

                soma += this.get(i, j);

                elementos[i][0] = soma;

            }

            soma = 0;

        }

        Vector v = new Vector(this.linhas, elementos);

        return v;

    }

    public Vector sumColumms(){

        double[][] elementos = new double[this.linhas][1];

        double soma = 0;

        for(int i = 0; i < this.linhas; i++){

            for(int j = 0; j < this.colunas; j++) {

                soma += this.get(j, i);

                elementos[i][0] = soma;

            }

            soma = 0;

        }

        Vector v = new Vector(this.linhas, elementos);

        return v;

    }

    public void show(){

        int i, j;

        for(i = 0; i < this.linhas; i++){

            System.out.print("[");

            for(j = 0; j < this.colunas - 1; j++){

                System.out.printf("%.1f ", this.elementos[i][j]);

            }

            System.out.printf("%.1f]\n", this.elementos[i][j]);

        }

    }

    public void showNDecimals(int n){

        int i, j;

        for(i = 0; i < this.linhas; i++){

            System.out.print("[");

            for(j = 0; j < this.colunas - 1; j++){

                System.out.printf("%." + n + "f ", this.elementos[i][j]);

            }

            System.out.printf("%." + n + "f]\n", this.elementos[i][j]);

        }

    }

}
