package icu.oo7.yyds.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Oauth2客户端数据传输对象
 *
 * @author peng.zhao
 */
@Data
public class ClientDetailsDTO implements Serializable {

    private static final long serialVersionUID = -5602937381699674476L;

    /**
     * 客户端ID
     */
    private String clientId;

    /**
     * 客户端可访问资源集合
     */
    private List<String> resourceIds;
}