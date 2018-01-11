package com.gdn.future.futureprogramwendy.service;

import com.gdn.future.futureprogramwendy.model.Address;
import com.gdn.future.futureprogramwendy.model.Address;
import com.gdn.future.futureprogramwendy.repositories.AddressRepository;
import com.gdn.future.futureprogramwendy.request.RegisterAddressRequest;
import com.gdn.future.futureprogramwendy.request.RegisterAddressRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    Address addAddress(String idCustomer, RegisterAddressRequest request);
    Address getAddress(String idCustomer, String idAddress);
    List<Address> getAllAddress(String idCustomer);
    void deleteAddress(String idCustomer, String idAddress);
    Address updateAddress(String idCustomer, String idAddress, RegisterAddressRequest request);
}
