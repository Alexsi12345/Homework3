package org.example;

import javax.persistence.*;

@Entity
@Table(name = "TREENODES")
public class TreeNode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "tree_id")
    private Tree tree;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private TreeNode parent;

    // Getters and setters
}
