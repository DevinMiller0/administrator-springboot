package cn.gleaners.administrator.utils;

import cn.gleaners.administrator.model.AdminEntity;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @author WangDeSheng
 * @date 2020/2/22 9:24
 * description：
 */
public class JwtUtils {

    /**
     * 生成token
     *
     * @param adminEntity AdminEntity
     * @return token
     */
    public static String generateToken(AdminEntity adminEntity) {
        JwtBuilder jwtBuilder = Jwts.builder()
                .setId(String.valueOf(adminEntity.getAid()))
                .setSubject(adminEntity.getUsername())
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "administrator")
                .setExpiration(new Date(new Date().getTime() + 1000 * 60 * 60 * 12));
        return jwtBuilder.compact();
    }

    /**
     * 解析验证
     *
     * @param token token
     * @return AdminEntity
     */
    public static AdminEntity parseToken(String token) {
        try {
            Claims claims = Jwts.parser().setSigningKey("administrator")
                    .parseClaimsJws(token)
                    .getBody();

            System.out.println(claims.getIssuedAt());

            AdminEntity adminEntity = new AdminEntity();

            adminEntity.setAid(Integer.parseInt(claims.getId()));
            adminEntity.setUsername(claims.getSubject());
            return adminEntity;
        } catch (Exception e) {
            return null;
        }
    }
}
