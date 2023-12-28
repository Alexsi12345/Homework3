package org.example;

// Класс Tree
import javax.persistence.*;
import java.util.List;
import org.example.TreeNode;

@Entity
@Table(name = "TREES")
public class Tree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "parent_id")
    private int parentId;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<TreeNode> children;

    public int getId() {
        return id;
    }

    // Остальные геттеры и сеттеры

    public List<TreeNode> getChildren() {
        return children;
    }
}

