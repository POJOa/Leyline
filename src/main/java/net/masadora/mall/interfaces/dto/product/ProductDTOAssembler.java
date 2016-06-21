package net.masadora.mall.interfaces.dto.product;

import net.masadora.mall.business.domain.common.category.Category;
import net.masadora.mall.business.domain.product.Product;
import net.masadora.mall.framework.domain.LeylineDO;
import net.masadora.mall.framework.interfaces.dto.LeylineDTO;
import net.masadora.mall.framework.interfaces.dto.assembler.DTOAssembler;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by POJO on 6/21/16.
 */
public class ProductDTOAssembler extends DTOAssembler<Product,ProductDTO>{

    public ModelMapper m = new ModelMapper();

    @Override
    public Product buildDO(ProductDTO d, Type dtoT) {
        m.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        Product res = m.map(d, Product.class);
        Type categoryListType = new TypeToken<List<Category>>() {}.getType();
        return res.setCategories(m.map(d.getCategories(),categoryListType));
    }
}
