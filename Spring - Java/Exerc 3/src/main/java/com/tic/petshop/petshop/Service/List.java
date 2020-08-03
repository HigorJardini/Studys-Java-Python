// public class List {
//   public void inserirValores(No node, int valor) {
//     //verifica se a árvore já foi criada
//      if (node != null) {
//       //Verifica se o valor a ser inserido é menor que o nodo corrente da árvore, se sim vai para subárvore esquerda
//       if (valor < node.valor) {
//           //Se tiver elemento no nodo esquerdo continua a busca
//           if (node.esquerda != null) {
//               inserirValores(node.esquerda, valor);
//           } else {
//               //Se nodo esquerdo vazio insere o novo nodo aqui
//               // System.out.println("  Inserindo " + valor + " a esquerda de " + node.valor);
//               node.esquerda = new No(valor);
//           }
//       //Verifica se o valor a ser inserido é maior que o nodo corrente da árvore, se sim vai para subárvore direita
//       } else if (valor > node.valor) {
//           //Se tiver elemento no nodo direito continua a busca
//           if (node.direita != null) {
//               inserirValores(node.direita, valor);
//           } else {
//               //Se nodo direito vazio insere o novo nodo aqui
//               // System.out.println("  Inserindo " + valor + " a direita de " + node.valor);
//               node.direita = new No(valor);
//           }
//       }
//     }
//   }
//   public No removeValorMinimo(No node) {
//     if (node == null) {
//         System.out.println("  ERRO ");
//     } else if (node.esquerda != null) {
//         node.esquerda = removeValorMinimo(node.esquerda);
//         return node;
//     } else {
//       //Se não tiver elemento esquerdo só nos resta o da direita
//         return node.direita;
//     }
//     return null;
//   }
// }