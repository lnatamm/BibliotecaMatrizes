import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Operador op;

        System.out.println("Operações:");

        System.out.println();

        System.out.println("    Operações de Matrizes e Vetores:");

        System.out.println();

        System.out.println("        Transpose: Transpõe uma Matriz ou Vetor");

        System.out.println("        Sum: Soma de uma Matriz ou Vetor com outra Matriz ou Vetor");

        System.out.println("        Times: Multiplicação(elemento a elemento) de uma Matriz, Vetor ou Escalar por uma Matriz ou Vetor");

        System.out.println("        Dot: Multiplicação de uma Matriz ou Vetor por uma Matriz ou Vetor");

        System.out.println("        Gauss: Redução Gaussiana de uma Matriz");

        System.out.println("        Solve: Solução de uma Matriz");

        System.out.println();

        System.out.println("    Transformações Lineares:");

        System.out.println();

        System.out.println("        Translate2D : Translação de um vetor (IR²) em (x, y)");

        System.out.println("        Translate3D : Translação de um vetor (IR³) em (x, y, z)");

        System.out.println("        Rotate2D : Rotação de um vetor (IR²) em x°(graus) em torno do eixo Z");

        System.out.println("        Rotate3DX : Rotação de um vetor (IR³) em x°(graus) em torno do eixo X");

        System.out.println("        Rotate3DY : Rotação de um vetor (IR³) em x°(graus) em torno do eixo Y");

        System.out.println("        Rotate3DZ : Rotação de um vetor (IR³) em x°(graus) em torno do eixo Z");

        System.out.println("        Reflect2DX : Reflexão de um vetor (IR²) em torno do eixo X");

        System.out.println("        Reflect2DY : Reflexão de um vetor (IR²) em torno do eixo Y");

        System.out.println("        Reflect3DX : Reflexão de um vetor (IR³) em torno do eixo X");

        System.out.println("        Reflect3DY : Reflexão de um vetor (IR³) em torno do eixo Y");

        System.out.println("        Reflect3DZ : Reflexão de um vetor (IR³) em torno do eixo Z");

        System.out.println("        Project2DX : Projeção de um vetor (IR²) no eixo X");

        System.out.println("        Project2DY : Projeção de um vetor (IR²) no eixo Y");

        System.out.println("        Project3DX : Projeção de um vetor (IR³) no eixo X");

        System.out.println("        Project3DY : Projeção de um vetor (IR³) no eixo Y");

        System.out.println("        Project3DZ : Projeção de um vetor (IR³) no eixo Z");

        System.out.println("        Shear: Cisalhamento de um vetor (IR²) em x vezes Y(X) e y vezes X(Y)");

        System.out.println();

        int controle = 1;

        while(controle == 1){

            op = new Operador();

            System.out.println("O que deseja fazer?");

            op.pedido(sc.next());

            System.out.println("Deseja continuar? Sim(1) Não(!1)");

            controle = Integer.parseInt(sc.next());

        }

    }

}