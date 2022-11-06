import java.util.*;

public class Operador {

    private LinearAlgebra op = new LinearAlgebra();

    private Transformations t = new Transformations();

    private String operacao;

    public Operador(){

        this.operacao = "";

    }

    public String getOperacao(){

        return this.operacao;

    }

    public void setOperacao(String operacao){

        this.operacao = operacao;

    }

    public void pedido(String operacao){

        this.operacao = operacao;

        Scanner sc = new Scanner(System.in);

        if(this.operacao.equals("transpose") || this.operacao.equals("Transpose")){

            System.out.println("Você deseja transpor uma Matriz ou um Vetor?");

            String tipo = sc.next();

            if(tipo.equals("Matriz") || tipo.equals("matriz")){

                System.out.print("Quantidade de Linhas: ");

                int linhas = Integer.parseInt(sc.next());

                System.out.print("Quantidade de Colunas: ");

                int colunas = Integer.parseInt(sc.next());

                System.out.println("Insira os Elementos:");

                double[][] elementos = new double[linhas][colunas];

                for(int i = 0; i < linhas; i++){

                    for(int j = 0; j < colunas; j++){

                        elementos[i][j] = Double.parseDouble(sc.next());

                    }

                }

                Matrix matrix = new Matrix(linhas, colunas, elementos);

                operacao(this.operacao, matrix);

            }

            if(tipo.equals("Vetor") || tipo.equals("vetor")){

                System.out.print("Dimensão do Vetor: ");

                int dim = Integer.parseInt(sc.next());

                System.out.println("Digite os elementos: ");

                double[][] elementos = new double[dim][1];

                for(int i = 0; i < dim; i++){

                    for(int j = 0; j < 1; j++){

                        elementos[i][j] = Double.parseDouble(sc.next());

                    }

                }

                Vector vector = new Vector(dim, elementos);

                operacao(this.operacao, vector);

            }

        }

        if(this.operacao.equals("sum") || this.operacao.equals("Sum") || this.operacao.equals("times") || this.operacao.equals("Times") || this.operacao.equals("dot") || this.operacao.equals("Dot")){

            if(this.operacao.equals("sum") || this.operacao.equals("Sum")){

                System.out.println("Qual o primeiro elemento a ser somado?");

            }

            if(this.operacao.equals("times") || this.operacao.equals("Times")){

                System.out.println("Qual o primeiro elemento a ser multiplicado(elemento a elemento)");

            }

            if(this.operacao.equals("dot") || this.operacao.equals("Dot")){

                System.out.println("Qual o primeiro elemento a ser multiplicado?");

            }

            String tipo1 = sc.next();

            if((this.operacao.equals("times") && tipo1.equals("Escalar")) || (this.operacao.equals("Times") && tipo1.equals("Escalar")) || (this.operacao.equals("times") && tipo1.equals("escalar")) || (this.operacao.equals("Times") && tipo1.equals("escalar"))){

                System.out.println("Escalar:");

                double escalar = Double.parseDouble(sc.next());

                System.out.println("Qual o segundo elemento a ser multiplicado(elemento a elemento)?");

                String tipo2 = sc.next();

                if(tipo2.equals("Matriz") || tipo2.equals("matriz")){

                    System.out.print("Quantidade de Linhas: ");

                    int linhas2 = Integer.parseInt(sc.next());

                    System.out.print("Quantidade de Colunas: ");

                    int colunas2 = Integer.parseInt(sc.next());

                    System.out.println("Insira os Elementos:");

                    double[][] elementos2 = new double[linhas2][colunas2];

                    for(int i = 0; i < linhas2; i++){

                        for(int j = 0; j < colunas2; j++){

                            elementos2[i][j] = Double.parseDouble(sc.next());

                        }

                    }

                    Matrix matrix2 = new Matrix(linhas2, colunas2, elementos2);

                    operacao(escalar, this.operacao, matrix2);

                }

                if(tipo2.equals("Vetor") || tipo2.equals("vetor")){

                    System.out.print("Dimensão do Vetor: ");

                    int dim2 = Integer.parseInt(sc.next());

                    System.out.println("Digite os elementos: ");

                    double[][] elementos2 = new double[dim2][1];

                    for(int i = 0; i < dim2; i++){

                        for(int j = 0; j < 1; j++){

                            elementos2[i][j] = Double.parseDouble(sc.next());

                        }

                    }

                    Vector vector2 = new Vector(dim2, elementos2);

                    operacao(escalar, this.operacao, vector2);

                }

            }



            if (tipo1.equals("Matriz") || tipo1.equals("matriz")) {

                System.out.print("Quantidade de Linhas: ");

                int linhas1 = Integer.parseInt(sc.next());

                System.out.print("Quantidade de Colunas: ");

                int colunas1 = Integer.parseInt(sc.next());

                System.out.println("Insira os Elementos:");

                double[][] elementos1 = new double[linhas1][colunas1];

                for (int i = 0; i < linhas1; i++) {

                    for (int j = 0; j < colunas1; j++) {

                        elementos1[i][j] = Double.parseDouble(sc.next());

                    }

                }

                Matrix matrix1 = new Matrix(linhas1, colunas1, elementos1);

                if(this.operacao.equals("sum") || this.operacao.equals("Sum")){

                    System.out.println("Qual o segundo elemento a ser somado?");

                }

                if(this.operacao.equals("times") || this.operacao.equals("Times")){

                    System.out.println("Qual o segundo elemento a ser multiplicado(elemento a elemento)");

                }

                if(this.operacao.equals("dot") || this.operacao.equals("Dot")){

                    System.out.println("Qual o segundo elemento a ser multiplicado?");

                }

                String tipo2 = sc.next();

                if (tipo2.equals("Matriz") || tipo2.equals("matriz")) {

                    System.out.print("Quantidade de Linhas: ");

                    int linhas2 = Integer.parseInt(sc.next());

                    System.out.print("Quantidade de Colunas: ");

                    int colunas2 = Integer.parseInt(sc.next());

                    System.out.println("Insira os Elementos:");

                    double[][] elementos2 = new double[linhas2][colunas2];

                    for (int i = 0; i < linhas2; i++) {

                        for (int j = 0; j < colunas2; j++) {

                            elementos2[i][j] = Double.parseDouble(sc.next());

                        }

                    }

                    Matrix matrix2 = new Matrix(linhas2, colunas2, elementos2);

                    operacao(matrix1, this.operacao, matrix2);

                }

                if (tipo2.equals("Vetor") || tipo2.equals("vetor")) {

                    System.out.print("Dimensão do Vetor: ");

                    int dim2 = Integer.parseInt(sc.next());

                    System.out.println("Digite os elementos: ");

                    double[][] elementos2 = new double[dim2][1];

                    for (int i = 0; i < dim2; i++) {

                        for (int j = 0; j < 1; j++) {

                            elementos2[i][j] = Double.parseDouble(sc.next());

                        }

                    }

                    Vector vector2 = new Vector(dim2, elementos2);

                    operacao(matrix1, this.operacao, vector2);

                }

            }

            if (tipo1.equals("Vetor") || tipo1.equals("vetor")) {

                System.out.print("Dimensão do Vetor: ");

                int dim1 = Integer.parseInt(sc.next());

                System.out.println("Digite os elementos: ");

                double[][] elementos1 = new double[dim1][1];

                for (int i = 0; i < dim1; i++) {

                    for (int j = 0; j < 1; j++) {

                        elementos1[i][j] = Double.parseDouble(sc.next());

                    }

                }

                Vector vector1 = new Vector(dim1, elementos1);

                if(this.operacao.equals("sum") || this.operacao.equals("Sum")){

                    System.out.println("Qual o segundo elemento a ser somado?");

                }

                if(this.operacao.equals("times") || this.operacao.equals("Times")){

                    System.out.println("Qual o segundo elemento a ser multiplicado(elemento a elemento)");

                }

                if(this.operacao.equals("dot") || this.operacao.equals("Dot")){

                    System.out.println("Qual o segundo elemento a ser multiplicado?");

                }

                String tipo2 = sc.next();

                if (tipo2.equals("Matriz") || tipo2.equals("matriz")) {

                    System.out.print("Quantidade de Linhas: ");

                    int linhas2 = Integer.parseInt(sc.next());

                    System.out.print("Quantidade de Colunas: ");

                    int colunas2 = Integer.parseInt(sc.next());

                    System.out.println("Insira os Elementos:");

                    double[][] elementos2 = new double[linhas2][colunas2];

                    for (int i = 0; i < linhas2; i++) {

                        for (int j = 0; j < colunas2; j++) {

                            elementos2[i][j] = Double.parseDouble(sc.next());

                        }

                    }

                    Matrix matrix2 = new Matrix(linhas2, colunas2, elementos2);

                    operacao(vector1, this.operacao, matrix2);

                }

                if (tipo2.equals("Vetor") || tipo2.equals("vetor")) {

                    System.out.print("Dimensão do Vetor: ");

                    int dim2 = Integer.parseInt(sc.next());

                    System.out.println("Digite os elementos: ");

                    double[][] elementos2 = new double[dim2][1];

                    for (int i = 0; i < dim2; i++) {

                        for (int j = 0; j < 1; j++) {

                            elementos2[i][j] = Double.parseDouble(sc.next());

                        }

                    }

                    Vector vector2 = new Vector(dim2, elementos2);

                    operacao(vector1, this.operacao, vector2);

                }

            }


        }

        if(this.operacao.equals("gauss") || this.operacao.equals("Gauss") || this.operacao.equals("solve") || this.operacao.equals("Solve")){

            if(this.operacao.equals("gauss") || this.operacao.equals("Gauss")){

                System.out.println("Digite a matriz a sofrer redução gaussiana:");

            }

            if(this.operacao.equals("solve") || this.operacao.equals("Solve")){

                System.out.println("Digite a matriz a ser resolvida:");

            }

            System.out.print("Quantidade de Linhas: ");

            int linhas = Integer.parseInt(sc.next());

            System.out.print("Quantidade de Colunas: ");

            int colunas = Integer.parseInt(sc.next());

            System.out.println("Insira os Elementos:");

            double[][] elementos = new double[linhas][colunas];

            for(int i = 0; i < linhas; i++){

                for(int j = 0; j < colunas; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Matrix matrix = new Matrix(linhas, colunas, elementos);

            operacao(this.operacao, matrix);

        }


        if(this.operacao.equals("translate2D") || this.operacao.equals("Translate2D")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[2][1];

            for(int i = 0; i < 2; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(2, elementos);

            System.out.println("Em quantas unidades em X?");

            double dx = Double.parseDouble(sc.next());

            System.out.println("Em quantas unidades em Y?");

            double dy = Double.parseDouble(sc.next());

            operacao(this.operacao, vector, dx, dy);

        }

        if(this.operacao.equals("translate3D") || this.operacao.equals("Translate3D")){

            System.out.println("Digite os elementos: ");

            double[][] elementos = new double[3][1];

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(3, elementos);

            System.out.println("Em quantas unidades em X?");

            double dx = Double.parseDouble(sc.next());

            System.out.println("Em quantas unidades em Y?");

            double dy = Double.parseDouble(sc.next());

            System.out.println("Em quantas unidade em Z?");

            double dz = Double.parseDouble(sc.next());

            operacao(this.operacao, vector, dx, dy, dz);

        }

        if(this.operacao.equals("rotate2D") || this.operacao.equals("Rotate2D")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[2][1];

            for(int i = 0; i < 2; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(2, elementos);

            System.out.println("Em quantos graus?");

            double angle = Double.parseDouble(sc.next());

            operacao(this.operacao, vector, angle);

        }

        if(this.operacao.equals("rotate3DX") || this.operacao.equals("Rotate3DX")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[3][1];

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(3, elementos);

            System.out.println("Em quantos graus?");

            double angle = Double.parseDouble(sc.next());

            operacao(this.operacao, vector, angle);

        }

        if(this.operacao.equals("rotate3DY") || this.operacao.equals("Rotate3DY")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[3][1];

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(3, elementos);

            System.out.println("Em quantos graus?");

            double angle = Double.parseDouble(sc.next());

            operacao(this.operacao, vector, angle);

        }

        if(this.operacao.equals("rotate3DZ") || this.operacao.equals("Rotate3DZ")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[3][1];

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(3, elementos);

            System.out.println("Em quantos graus?");

            double angle = Double.parseDouble(sc.next());

            operacao(this.operacao, vector, angle);

        }

        if(this.operacao.equals("reflect2DX") || this.operacao.equals("Reflect2DX")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[2][1];

            for(int i = 0; i < 2; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(2, elementos);

            operacao(this.operacao, vector);

        }

        if(this.operacao.equals("reflect2DY") || this.operacao.equals("Reflect2DY")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[2][1];

            for(int i = 0; i < 2; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(2, elementos);

            operacao(this.operacao, vector);

        }

        if(this.operacao.equals("reflect3DX") || this.operacao.equals("Reflect3DX")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[3][1];

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(3, elementos);

            operacao(this.operacao, vector);

        }

        if(this.operacao.equals("reflect3DY") || this.operacao.equals("Reflect3DY")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[3][1];

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(3, elementos);

            operacao(this.operacao, vector);

        }

        if(this.operacao.equals("reflect3DZ") || this.operacao.equals("Reflect3DZ")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[3][1];

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(3, elementos);

            operacao(this.operacao, vector);

        }

        if(this.operacao.equals("project2DX") || this.operacao.equals("Project2DX")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[2][1];

            for(int i = 0; i < 2; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(2, elementos);

            operacao(this.operacao, vector);

        }

        if(this.operacao.equals("project2DY") || this.operacao.equals("Project2DY")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[2][1];

            for(int i = 0; i < 2; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(2, elementos);

            operacao(this.operacao, vector);

        }

        if(this.operacao.equals("project3DX") || this.operacao.equals("Project3DX")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[3][1];

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(3, elementos);

            operacao(this.operacao, vector);

        }

        if(this.operacao.equals("project3DY") || this.operacao.equals("Project3DY")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[3][1];

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(3, elementos);

            operacao(this.operacao, vector);

        }

        if(this.operacao.equals("project3DZ") || this.operacao.equals("Project3DZ")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[3][1];

            for(int i = 0; i < 3; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(3, elementos);

            operacao(this.operacao, vector);

        }

        if(this.operacao.equals("shear") || this.operacao.equals("Shear")){

            System.out.println("Insira os elementos do Vetor: ");

            double[][] elementos = new double[2][1];

            for(int i = 0; i < 2; i++){

                for(int j = 0; j < 1; j++){

                    elementos[i][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(2, elementos);

            System.out.println("Em quantas vezes Y(X)?");

            double kx = Double.parseDouble(sc.next());

            System.out.println("Em quantas vezes X(Y)?");

            double ky = Double.parseDouble(sc.next());

            operacao(this.operacao, vector, kx, ky);

        }

    }

    private void operacao(String operacao, Matrix matrix){

        this.operacao = operacao;

        if(this.operacao.equals("transpose") || this.operacao.equals("Transpose")){

            this.op.transpose(matrix);

        }

        if(this.operacao.equals("gauss") || this.operacao.equals("Gauss")){

            this.op.gauss(matrix);

        }

        if(this.operacao.equals("solve") || this.operacao.equals("Solve")){

            this.op.solve(matrix);

        }

    }

    private void operacao(String operacao, Vector vector, double angle){

        if(this.operacao.equals("rotate2D") || this.operacao.equals("Rotate2D")){

            this.t.rotation2D(vector, angle);

        }

        if(this.operacao.equals("rotate3DX") || this.operacao.equals("Rotate3DX")){

            this.t.rotation3DX(vector, angle);

        }

        if(this.operacao.equals("rotate3DY") || this.operacao.equals("Rotate3DY")){

            this.t.rotation3DY(vector, angle);

        }

        if(this.operacao.equals("rotate3DZ") || this.operacao.equals("Rotate3DZ")){

            this.t.rotation3DZ(vector, angle);

        }

    }

    private void operacao(String operacao, Vector vector, double dx, double dy){

        if(this.operacao.equals("translate2D") || this.operacao.equals("Translate2D")){

            this.t.translate2D(vector, dx, dy);

        }

        if(this.operacao.equals("shear") || this.operacao.equals("Shear")){

            this.t.shearing(vector, dx, dy);

        }

    }

    private void operacao(String operacao, Vector vector, double dx, double dy, double dz){

        if(this.operacao.equals("translate3D") || this.operacao.equals("Translate3D")){

            this.t.translate3D(vector, dx, dy, dz);

        }

    }

    private void operacao(String operacao, Vector vector){

        this.operacao = operacao;

        if(this.operacao.equals("transpose") || this.operacao.equals("Transpose")){

            this.op.transpose(vector);

        }

        if(this.operacao.equals("reflect2DX") || this.operacao.equals("Reflect2DX")){

            this.t.reflection2DX(vector);

        }

        if(this.operacao.equals("reflect2DY") || this.operacao.equals("Reflect2DY")){

            this.t.reflection2DY(vector);

        }

        if(this.operacao.equals("reflect3DX") || this.operacao.equals("Reflect3DX")){

            this.t.reflection3DX(vector);

        }

        if(this.operacao.equals("reflect3DY") || this.operacao.equals("Reflect3DY")){

            this.t.reflection3DY(vector);

        }

        if(this.operacao.equals("reflect3DZ") || this.operacao.equals("Reflect3DZ")){

            this.t.reflection3DZ(vector);

        }

        if(this.operacao.equals("project2DX") || this.operacao.equals("Project2DX")){

            this.t.projection2DX(vector);

        }

        if(this.operacao.equals("project2DY") || this.operacao.equals("Project2DY")){

            this.t.projection2DY(vector);

        }

        if(this.operacao.equals("project3DX") || this.operacao.equals("Project3DX")){

            this.t.projection3DX(vector);

        }

        if(this.operacao.equals("project3DY") || this.operacao.equals("Project3DY")){

            this.t.projection3DY(vector);

        }

        if(this.operacao.equals("project3DZ") || this.operacao.equals("Project3DZ")){

            this.t.projection3DZ(vector);

        }

    }

    private void operacao(Matrix m1, String operacao, Matrix m2){

        this.operacao = operacao;

        if(this.operacao.equals("sum") || this.operacao.equals("Sum")){

            this.op.sum(m1, m2);

        }

        if(this.operacao.equals("times") || this.operacao.equals("Times")){

            this.op.times(m1, m2);

        }

        if(this.operacao.equals("dot") || this.operacao.equals("Dot")){

            this.op.dot(m1, m2);

        }

    }

    private void operacao(double escalar, String operacao, Matrix matrix){

        this.operacao = operacao;

        if(this.operacao.equals("times") || this.operacao.equals("Times")){

            this.op.times(escalar, matrix);

        }

    }

}