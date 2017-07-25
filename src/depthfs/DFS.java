/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package depthfs;

import java.util.Stack;

/**
 *
 * @author Yogesh
 */
public class DFS {
    private Stack<Vertex> stack;
 
    public DFS(){
        this.stack = new Stack<>(); 
}
    
    public void dfs(Vertex root){
        stack.add(root);
        root.setVisited(true);
        
        while(!stack.isEmpty()){
            Vertex actualvertex = stack.pop();
            System.out.print( actualvertex+" ");
            
            for(Vertex v:actualvertex.getAdjacenciesList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    v.setPredecessor(actualvertex);
                    stack.push(v);
                    
                }
            }
            
        }
    }
        
    
}
