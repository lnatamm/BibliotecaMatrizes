public class PageRank {

    private LinearAlgebra op = new LinearAlgebra();

    private Matrix adjacentMatrix;

    public PageRank(){

        this.adjacentMatrix = new Matrix();

    }

    public void setAdjacentMatrix(Matrix adjacentMatrix){

        this.adjacentMatrix = adjacentMatrix;

    }

    private boolean isAdjacentMatrixSet(){

        if(this.adjacentMatrix.getLinhas() > 0 && this.adjacentMatrix.getColunas() > 0){

            return true;

        }

        else{

            return false;

        }

    }

    public Vector getAn(int n){

        if(isAdjacentMatrixSet()) {

            Vector avn = this.adjacentMatrix.sumColumms();

            for (int i = 0; i < n; i++) {

                Vector cvn = avn;

                Vector acvn = new Vector();

                double[][] elementos = new double[this.adjacentMatrix.getLinhas()][1];

                for (int ii = 0; ii < this.adjacentMatrix.getLinhas(); ii++) {

                    for (int jj = 0; jj < 1; jj++) {

                        elementos[ii][jj] = 0;

                    }

                }

                Vector dcvn = new Vector(this.adjacentMatrix.getLinhas(), elementos);

                for (int ii = 0; ii < this.adjacentMatrix.getLinhas(); ii++) {

                    for (int jj = 0; jj < 1; jj++) {

                        acvn = op.getTimes(cvn.get(ii), this.adjacentMatrix.getColumm(ii));

                    }

                    dcvn = op.getSum(acvn, dcvn);

                }

                cvn = dcvn;

                cvn = cvn.getNormalized(op);

                avn = cvn;

                Vector aavn = new Vector();

                for (int ii = 0; ii < this.adjacentMatrix.getLinhas(); ii++) {

                    for (int jj = 0; jj < 1; jj++) {

                        elementos[ii][jj] = 0;

                    }

                }

                Vector davn = new Vector(this.adjacentMatrix.getLinhas(), elementos);

                for (int ii = 0; ii < this.adjacentMatrix.getLinhas(); ii++) {

                    for (int jj = 0; jj < 1; jj++) {

                        aavn = op.getTimes(avn.get(ii), op.getTranspose(this.adjacentMatrix).getColumm(ii));

                    }

                    davn = op.getSum(aavn, davn);

                }

                avn = davn;

                avn = avn.getNormalized(op);

            }

            return avn;
        }

        else {

            return new Vector();

        }

    }

    public Vector getCn(int n){

        if(isAdjacentMatrixSet()) {

            Vector avn = this.adjacentMatrix.sumColumms();

            Vector cvn = this.adjacentMatrix.sumLines();

            for (int i = 0; i < n; i++) {

                cvn = avn;

                Vector acvn = new Vector();

                double[][] elementos = new double[this.adjacentMatrix.getLinhas()][1];

                for (int ii = 0; ii < this.adjacentMatrix.getLinhas(); ii++) {

                    for (int jj = 0; jj < 1; jj++) {

                        elementos[ii][jj] = 0;

                    }

                }

                Vector dcvn = new Vector(this.adjacentMatrix.getLinhas(), elementos);

                for (int ii = 0; ii < this.adjacentMatrix.getLinhas(); ii++) {

                    for (int jj = 0; jj < 1; jj++) {

                        acvn = op.getTimes(cvn.get(ii), this.adjacentMatrix.getColumm(ii));

                    }

                    dcvn = op.getSum(acvn, dcvn);

                }

                cvn = dcvn;

                cvn = cvn.getNormalized(op);

                avn = cvn;

                Vector aavn = new Vector();

                for (int ii = 0; ii < this.adjacentMatrix.getLinhas(); ii++) {

                    for (int jj = 0; jj < 1; jj++) {

                        elementos[ii][jj] = 0;

                    }

                }

                Vector davn = new Vector(this.adjacentMatrix.getLinhas(), elementos);

                for (int ii = 0; ii < this.adjacentMatrix.getLinhas(); ii++) {

                    for (int jj = 0; jj < 1; jj++) {

                        aavn = op.getTimes(avn.get(ii), op.getTranspose(this.adjacentMatrix).getColumm(ii));

                    }

                    davn = op.getSum(aavn, davn);

                }

                avn = davn;

                avn = avn.getNormalized(op);

            }

            return cvn;

        }

        else{

            return new Vector();

        }

    }

}

