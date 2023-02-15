public class LinearAlgebra {

    public void transpose(Matrix matrix){

        double[][] elementos = new double[matrix.getColunas()][matrix.getLinhas()];

        for(int i = 0; i < matrix.getColunas(); i++){

            for(int j = 0; j < matrix.getLinhas(); j++){

                elementos[i][j] = matrix.get(j, i);

            }

        }

        Matrix transposedMatrix = new Matrix(matrix.getColunas(), matrix.getLinhas(), elementos);

        transposedMatrix.show();

    }

    public Matrix getTranspose(Matrix matrix){

        double[][] elementos = new double[matrix.getColunas()][matrix.getLinhas()];

        for(int i = 0; i < matrix.getColunas(); i++){

            for(int j = 0; j < matrix.getLinhas(); j++){

                elementos[i][j] = matrix.get(j, i);

            }

        }

        Matrix transposedMatrix = new Matrix(matrix.getColunas(), matrix.getLinhas(), elementos);

        return transposedMatrix;

    }

    public void transpose(Vector vector){

        double[][] elementos = new double[1][vector.getDim()];

        for(int i = 0; i < vector.getDim(); i++){

            elementos[0][i] = vector.get(i);

        }

        Matrix transposedMatrix = new Matrix(1, vector.getDim(), elementos);

        transposedMatrix.show();

    }

    public Matrix getTranspose(Vector vector){

        double[][] elementos = new double[1][vector.getDim()];

        for(int i = 0; i < vector.getDim(); i++){

            elementos[0][i] = vector.get(i);

        }

        Matrix transposedMatrix = new Matrix(1, vector.getDim(), elementos);

        return transposedMatrix;

    }



    public void sum(Matrix m1, Matrix m2){

        if(m1.getLinhas() != m2.getLinhas() || m1.getColunas() != m2.getColunas()) System.out.println("Soma Impossível");

        else {

            int linhas = m1.getLinhas();

            int colunas = m1.getColunas();

            double[][] elementos = new double[m1.getLinhas()][m1.getColunas()];

            for(int i = 0; i < m1.getLinhas(); i++){

                for(int j = 0; j < m1.getColunas(); j++){

                    elementos[i][j] = m1.get(i, j) + m2.get(i, j);

                }

            }

            Matrix r = new Matrix(m1.getLinhas(), m1.getColunas(), elementos);

            r.show();

        }

    }

    public Matrix getSum(Matrix m1, Matrix m2){

        if(m1.getLinhas() != m2.getLinhas() || m1.getColunas() != m2.getColunas()) System.out.println("Soma Impossível");

        else {

            int linhas = m1.getLinhas();

            int colunas = m1.getColunas();

            double[][] elementos = new double[m1.getLinhas()][m1.getColunas()];

            for(int i = 0; i < m1.getLinhas(); i++){

                for(int j = 0; j < m1.getColunas(); j++){

                    elementos[i][j] = m1.get(i, j) + m2.get(i, j);

                }

            }

            Matrix r = new Matrix(m1.getLinhas(), m1.getColunas(), elementos);

            return r;

        }

        return new Matrix();

    }

    public Vector getSum(Vector v1, Vector v2){

        if(v1.getLinhas() != v2.getLinhas() || v1.getColunas() != v2.getColunas()) System.out.println("Soma Impossível");

        else {

            int linhas = v1.getLinhas();

            int colunas = v1.getColunas();

            double[][] elementos = new double[v1.getLinhas()][v1.getColunas()];

            for(int i = 0; i < v1.getLinhas(); i++){

                for(int j = 0; j < v1.getColunas(); j++){

                    elementos[i][j] = v1.get(i, j) + v2.get(i, j);

                }

            }

            Vector r = new Vector(v1.getLinhas(), elementos);

            return r;

        }

        return new Vector();

    }

    public void times(double n, Matrix matrix){

        double[][] elementos = new double[matrix.getLinhas()][matrix.getColunas()];

        for(int i = 0; i < matrix.getLinhas(); i++){

            for(int j = 0; j < matrix.getColunas(); j++){

                elementos[i][j] = matrix.get(i, j) * n;

            }

        }

        Matrix timedMatrix = new Matrix(matrix.getLinhas(), matrix.getColunas(), elementos);

        timedMatrix.show();

    }

    public Matrix getTimes(double n, Matrix matrix){

        double[][] elementos = new double[matrix.getLinhas()][matrix.getColunas()];

        for(int i = 0; i < matrix.getLinhas(); i++){

            for(int j = 0; j < matrix.getColunas(); j++){

                elementos[i][j] = matrix.get(i, j) * n;

            }

        }

        Matrix timedMatrix = new Matrix(matrix.getLinhas(), matrix.getColunas(), elementos);

        return timedMatrix;

    }

    public Vector getTimes(double n, Vector v){

        double[][] elementos = new double[v.getLinhas()][1];

        for(int i = 0; i < v.getDim(); i++){

            for(int j = 0; j < v.getColunas(); j++){

                elementos[i][j] = v.get(i) * n;

            }

        }

        Vector timedVector = new Vector(v.getDim(), elementos);

        return timedVector;

    }

    public void times(Matrix m1, Matrix m2){

        if(m1.getLinhas() != m2.getLinhas() || m1.getColunas() != m2.getColunas()) System.out.println("Multiplicação Impossível");

        else {

            int linhas = m1.getLinhas();

            int colunas = m1.getColunas();

            double[][] elementos = new double[linhas][colunas];

            for(int i = 0; i < linhas; i++){

                for(int j = 0; j < colunas; j++){

                    elementos[i][j] = m1.get(i, j) * m2.get(i, j);

                }

            }

            Matrix timedMatrix = new Matrix(linhas, colunas, elementos);

            timedMatrix.show();

        }

    }

    public Matrix getTimes(Matrix m1, Matrix m2){

        if(m1.getLinhas() != m2.getLinhas() || m1.getColunas() != m2.getColunas()) System.out.println("Multiplicação Impossível");

        else {

            int linhas = m1.getLinhas();

            int colunas = m1.getColunas();

            double[][] elementos = new double[linhas][colunas];

            for(int i = 0; i < linhas; i++){

                for(int j = 0; j < colunas; j++){

                    elementos[i][j] = m1.get(i, j) * m2.get(i, j);

                }

            }

            Matrix timedMatrix = new Matrix(linhas, colunas, elementos);

            return timedMatrix;

        }

        return new Matrix();

    }

    public void dot(Matrix m1, Matrix m2){

        if(m1.getColunas() != m2.getLinhas()) System.out.print("Multiplicação Impossível");

        else {

            int linhas = m1.getLinhas();

            int colunas = m2.getColunas();

            double[][] elementos = new double[linhas][colunas];

            double soma;

            int i, j;

            for(int c = 0; c < m2.getColunas(); c++) {

                for (i = 0; i < linhas; i++) {

                    soma = 0;

                    for (j = 0; j < m1.getColunas(); j++) {

                        soma += m1.get(i, j) * m2.get(j, c);

                    }

                    elementos[i][c] = soma;

                }

            }

            Matrix dottedMatrix = new Matrix(linhas, colunas, elementos);

            dottedMatrix.show();

        }

    }

    public Matrix getDot(Matrix m1, Matrix m2){

        if(m1.getColunas() != m2.getLinhas()) System.out.print("Multiplicação Impossível");

        else {

            int linhas = m1.getLinhas();

            int colunas = m2.getColunas();

            double[][] elementos = new double[linhas][colunas];

            double soma;

            int i, j;

            for(int c = 0; c < m2.getColunas(); c++) {

                for (i = 0; i < linhas; i++) {

                    soma = 0;

                    for (j = 0; j < m1.getColunas(); j++) {

                        soma += m1.get(i, j) * m2.get(j, c);

                    }

                    elementos[i][c] = soma;

                }

            }

            Matrix dottedMatrix = new Matrix(linhas, colunas, elementos);

            return dottedMatrix;

        }

        return new Matrix();

    }

    public Vector getDot(Matrix m, Vector v){

        if(m.getColunas() != v.getDim()) System.out.print("Multiplicação Impossível");

        else {

            int linhas = m.getLinhas();

            int colunas = 1;

            double[][] elementos = new double[linhas][colunas];

            double soma;

            int i, j;

            for(int c = 0; c < v.getColunas(); c++) {

                for (i = 0; i < linhas; i++) {

                    soma = 0;

                    for (j = 0; j < m.getColunas(); j++) {

                        soma += m.get(i, j) * m.get(j, c);

                    }

                    elementos[i][c] = soma;

                }

            }

            Vector dottedVector = new Vector(linhas, elementos);

            return dottedVector;

        }

        return new Vector();

    }

    public void gauss(Matrix matrix){

        double gaussReducedMatrix[][] = new double[matrix.getLinhas()][matrix.getColunas()];

        double div;

        double mul = 1;

        int linhaI = 0;

        for (int i = 0; i < matrix.getLinhas(); i++) {

            for (int j = 0; j < matrix.getColunas(); j++) {

                if(i == j && matrix.get(i, j) != 1) {

                    if(i == 0) {

                        div = matrix.get(i, j);

                        for(int jj = j; jj < matrix.getColunas(); jj++) {

                            gaussReducedMatrix[i][jj] = matrix.get(i, jj) / div;
                        }

                    }
                    else {

                        div = gaussReducedMatrix[i][j];

                        for(int jj = j; jj < matrix.getColunas(); jj++) {

                            gaussReducedMatrix[i][jj] = gaussReducedMatrix[i][jj] / div;

                        }

                    }

                    j = matrix.getColunas() - 1;

                }

                else if(i > j && matrix.get(i, j) != 0) {

                    if(j == 0) {

                        mul = matrix.get(i, j);

                        for(int linha = i - 1; linha >= 0; linha--) {

                            if(gaussReducedMatrix[linha][j] == 1) {

                                linhaI = linha;

                                break;

                            }

                        }

                        for(int jj = j; jj < matrix.getColunas(); jj++) {

                            gaussReducedMatrix[i][jj] = matrix.get(i, jj) - (mul * gaussReducedMatrix[linhaI][jj]);

                        }

                    }
                    else {

                        mul = gaussReducedMatrix[i][j];

                        for(int row = i - 1; row >= 0; row--) {

                            if(gaussReducedMatrix[row][j] == 1) {

                                linhaI = row;

                                break;

                            }

                        }

                        for(int jj = j; jj < matrix.getColunas(); jj++) {

                            gaussReducedMatrix[i][jj] = gaussReducedMatrix[i][jj] - (mul * gaussReducedMatrix[linhaI][jj]);

                        }

                    }

                }

                else {

                    gaussReducedMatrix[i][j] = matrix.get(i, j);

                }

            }

        }

        Matrix gauusMatrix = new Matrix(matrix.getLinhas(), matrix.getColunas(), gaussReducedMatrix);

        gauusMatrix.show();

    }

    public void solve(Matrix matrix){

        int rowIndex = 0;

        double multiplicador = 1;

        double divisor;

        double ampliedArray[][] = new double[matrix.getLinhas()][matrix.getColunas()];

        for (int i = 0; i < matrix.getLinhas(); i++) {

            for (int j = 0; j < matrix.getColunas() - 1; j++) {

                if(i == j && matrix.get(i, j) != 1) {

                    if(i == 0) {

                        divisor = matrix.get(i, j);

                        for(int k = j; k < matrix.getColunas(); k++) {

                            ampliedArray[i][k] = matrix.get(i, k) / divisor;

                        }

                    }
                    else {

                        divisor = ampliedArray[i][j];

                        for(int k = j; k < matrix.getColunas(); k++) {

                            ampliedArray[i][k] = ampliedArray[i][k] / divisor;

                        }

                    }

                    j = matrix.getColunas() - 1;

                }

                else if(i > j && matrix.get(i, j) != 0) {

                    if(j == 0) {

                        multiplicador = matrix.get(i, j);

                        for(int row = i - 1; row >= 0; row--) {

                            if(ampliedArray[row][j] == 1) {

                                rowIndex = row;

                                break;

                            }

                        }

                        for(int k = j; k < matrix.getColunas(); k++) {

                            ampliedArray[i][k] = matrix.get(i, k) - (multiplicador * ampliedArray[rowIndex][k]);

                        }

                    }
                    else {

                        multiplicador = ampliedArray[i][j];

                        for(int row = i - 1; row >= 0; row--) {

                            if(ampliedArray[row][j] == 1) {

                                rowIndex = row;

                                break;

                            }

                        }

                        for(int k = j; k < matrix.getColunas(); k++)

                            ampliedArray[i][k] = ampliedArray[i][k] - (multiplicador * ampliedArray[rowIndex][k]);

                    }

                }

                else {

                    ampliedArray[i][j] = matrix.get(i, j);

                }

            }

        }

        for(int i = matrix.getLinhas() - 1; i >= 0; i--) {

            for(int j = matrix.getColunas() - 2; j >= 0; j--) {

                if(j > i && matrix.get(i, j) != 0) {

                    multiplicador = ampliedArray[i][j];

                    for(int row = i + 1; row < matrix.getLinhas(); row++) {

                        if(ampliedArray[row][j] == 1) {

                            rowIndex = row;

                            break;

                        }

                    }

                    for(int k = matrix.getColunas() - 1; k >= 0; k--) {

                        ampliedArray[i][k] = ampliedArray[i][k] - (multiplicador * ampliedArray[rowIndex][k]);

                    }

                }

            }

        }

        Matrix solvedMatrix = new Matrix(matrix.getLinhas(), matrix.getColunas(), ampliedArray);

        solvedMatrix.show();

    }

}
