/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package depthfs;

/**
 *
 * @author Yogesh
 */
public class applica {
    public static void main(String[] args){
        
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");
       
        
        vertexA.addNeighbour(vertexB);
        vertexA.addNeighbour(vertexC);
        
        vertexB.addNeighbour(vertexD);
        vertexC.addNeighbour(vertexE);
        vertexB.addNeighbour(vertexF);
        
        DFS dfs = new DFS();
        dfs.dfs(vertexA);
        
        
    }
}
