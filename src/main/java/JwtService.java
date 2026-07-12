import org.springframework.stereotype.Service;

@Service
public class JwtService {
    public static final String SECRET = "XYSAYDASID12657489054362836";
    public String generateToken (String Username){
          return Jwts.builder()
                  .setSubject(username)
                  .setIssuedAt(new Date(System.currentTimeMillis()))
                  .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))
                  .signWith(getSignKey(), SignatureAlgorithm.HS256)
                  .compact()

    }
}
