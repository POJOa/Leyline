package net.masadora.mall.business.domain.user;

import lombok.Data;
import net.masadora.mall.framework.domain.AppDO;

import javax.persistence.*;

/**
 * Created by POJO on 6/20/16.
 */
@Entity
@Data
@Cacheable
@Table(name="s_role")
@NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r")
public class Role implements AppDO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}