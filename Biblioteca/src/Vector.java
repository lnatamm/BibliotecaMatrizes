public class Vector extends Matrix{

    private int dim;

    public Vector(){

        super();

        this.dim = 0;

    }

    public Vector(int dim, double[][] elementos){

        super(dim, 1, elementos);

        this.dim = dim;

    }

    public int getDim(){

        return this.dim;

    }

    public void setDim(int dim){

        this.dim = dim;

    }

    public double get(int i){

        return this.get(i, 0);

    }

    public void set(int i, double elemento){

        this.set(i, 0, elemento);

    }

    public double getSumSqrt(){

        double soma = 0;

        for(int i = 0; i < this.getDim(); i++){

            for(int j = 0; j < 1; j++){

                soma += this.get(i) * this.get(i);

            }

        }

        return soma;

    }

    public Vector getNormalized(LinearAlgebra op){

        Vector v = new Vector(this.dim, this.getElementos());

        return op.getTimes(1 / Math.sqrt(getSumSqrt()), v);

    }

}
