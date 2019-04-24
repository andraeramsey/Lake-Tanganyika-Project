/**
 *File Name: History.java 
 *Programmer: Jeffrey Ryan
 *jryan3
 *
 *Date: Oct 10, 2017
 *
 *Class: IT 179
 *Lecture Section 002
 *Lecture Instructor: Tonya Pierce
 */
package lakeTanganyika;

import java.awt.Color;
import java.awt.Graphics;

/**
 * <Insert class description here>
 *
 *@author Jeffrey Ryan
 *
 */

import java.util.ArrayList;

import javax.swing.JFrame;

public class History extends JFrame
{
	

		/* Simple graph drawing class
		Bert Huang
		COMS 3137 Data Structures and Algorithms, Spring 2009

		This class is really elementary, but lets you draw 
		reasonably nice graphs/trees/diagrams. Feel free to 
		improve upon it!
		 */
		    int width;
		    int height;
		    int[] hist;

		    ArrayList<Node> nodes;
		    ArrayList<edge> edges;

		    public History(String name, int[] hist) { //Construct with label
		    this.hist=hist;
			this.setTitle(name);
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			nodes = new ArrayList<Node>();
			edges = new ArrayList<edge>();
			width = 30;
			height = 30;
		    }

		    class Node {
			int x, y;
			String name;
			
			public Node(String myName, int myX, int myY) {
			    x = myX;
			    y = myY;
			    name = myName;
			}
		    }
		    
		    class edge {
			int i,j;
			
			public edge(int ii, int jj) {
			    i = ii;
			    j = jj;	    
			}
		    }
		    
		    public void addNode(String name, int x, int y) { 
			//add a node at pixel (x,y)
			nodes.add(new Node(name,x,y));
			this.repaint();
		    }
		    public void addEdge(int i, int j) {
			//add an edge between nodes i and j
			edges.add(new edge(i,j));
			this.repaint();
		    }
		    
		    public void paint(Graphics g) { // draw the nodes and edges
			//FontMetrics f = g.getFontMetrics();
			//int nodeHeight = Math.max(height, f.getHeight());

			g.setColor(Color.black);
			for (edge e : edges) {
			    g.drawLine(nodes.get(e.i).x, nodes.get(e.i).y,
				     nodes.get(e.j).x, nodes.get(e.j).y);
			}

			/*for (Node n : nodes) {
			    int nodeWidth = Math.max(width, f.stringWidth(n.name)+width/2);
			    g.setColor(Color.white);
			    g.fillOval(n.x-nodeWidth/2, n.y-nodeHeight/2, 
				       nodeWidth, nodeHeight);
			    g.setColor(Color.black);
			    g.drawOval(n.x-nodeWidth/2, n.y-nodeHeight/2, 
				       nodeWidth, nodeHeight);
			    
			    g.drawString(n.name, n.x-f.stringWidth(n.name)/2,
					 n.y+f.getHeight()/2);
			}*/
		    }
		}

