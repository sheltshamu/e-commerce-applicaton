package zw.co.getsol.ecommerce_application.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private Double price;
    private String description;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;
}
