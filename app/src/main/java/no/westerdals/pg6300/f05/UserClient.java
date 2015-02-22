package no.westerdals.pg6300.f05;

import no.westerdals.pg6300.f05.model.User;
import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.util.List;

@Rest(rootUrl = "http://10.0.3.2:8081/users", converters = {GsonHttpMessageConverter.class})
public interface UserClient
{
    @Get("/")
    List<User> query();
}
