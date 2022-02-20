package io.comet.ws.controller;

import io.comet.ws.adapters.WalletAdapter;
import io.comet.ws.model.AdapterRequest;
import io.comet.ws.model.AssetDto;
import io.comet.ws.model.ProfileDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private WalletAdapter walletAdapter;

    @GetMapping("/connect")
    public void connect(){
        walletAdapter.connect();
    }

    @GetMapping("/profile/{walletId}")
    public ProfileDto getProfileInfo(@PathVariable(name = "walletId") String walletId){
        return walletAdapter.getProfileInfo(new AdapterRequest(walletId));
    }

    @GetMapping("/assets/{walletId}")
    public List<AssetDto> getAssetsInfo(@PathVariable(name = "walletId") String walletId){
        return walletAdapter.getAssetsInfo(new AdapterRequest(walletId));
    }

}
