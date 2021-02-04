package com.americanfirstfinance.account.service;

import com.americanfirstfinance.account.form.DownPayment;
import com.americanfirstfinance.account.view.Receipt;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/poc/account/downpayment")
@RegisterRestClient(configKey = "account-api")
public interface AccountService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response postDownPayment(DownPayment payment);
}
