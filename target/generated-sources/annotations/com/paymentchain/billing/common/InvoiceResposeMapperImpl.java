package com.paymentchain.billing.common;

import com.paymentchain.billing.dto.InvoiceResponse;
import com.paymentchain.billing.entities.Invoice;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-18T00:23:22-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class InvoiceResposeMapperImpl implements InvoiceResposeMapper {

    @Override
    public InvoiceResponse InvoiceToInvoiceRespose(Invoice source) {
        if ( source == null ) {
            return null;
        }

        InvoiceResponse invoiceResponse = new InvoiceResponse();

        invoiceResponse.setInvoiceId( source.getId() );
        invoiceResponse.setCustomer( source.getCustomerId() );
        invoiceResponse.setNumber( source.getNumber() );
        invoiceResponse.setDetail( source.getDetail() );
        invoiceResponse.setAmount( source.getAmount() );

        return invoiceResponse;
    }

    @Override
    public List<InvoiceResponse> InvoiceListToInvoiceResposeList(List<Invoice> source) {
        if ( source == null ) {
            return null;
        }

        List<InvoiceResponse> list = new ArrayList<InvoiceResponse>( source.size() );
        for ( Invoice invoice : source ) {
            list.add( InvoiceToInvoiceRespose( invoice ) );
        }

        return list;
    }
}
