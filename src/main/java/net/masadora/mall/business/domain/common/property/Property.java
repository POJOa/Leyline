package net.masadora.mall.business.domain.common.property;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.masadora.mall.business.domain.common.category.Category;
import net.masadora.mall.framework.domain.AppDO;

import javax.persistence.*;


/**
 * The persistent class for the mall_d_property database table.
 * 
 */
@Entity
@Cacheable
//@EqualsAndHashCode(exclude={"category"})
@EqualsAndHashCode
@ToString
@Table(name="mall_d_property")
@NamedQuery(name="Property.findAll", query="SELECT p FROM Property p")
public class Property implements AppDO {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String name;

	@ManyToOne(cascade = CascadeType.MERGE)
	private Category category;

	public Property() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}