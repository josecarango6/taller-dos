package co.com.poli.showtimesservice.clientFeign;

import co.com.poli.showtimesservice.helpers.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "movies-service", fallback = CustomerClientImplHystrixFallBack.class)
public interface MoviesClient {

    @GetMapping("/store/api/v1/movies/{id}")
    Response findByID(@PathVariable("id") Long id);

}
