package io.comet.ws.adapters;

import io.comet.ws.model.AdapterRequest;
import io.comet.ws.model.AssetDto;
import io.comet.ws.model.ProfileDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "pythonadapter", url = "http://jovial_wescoff:8000/")
public interface WalletAdapter {

    @GetMapping(value = "/get_profile_info")
    ProfileDto getProfileInfo(@RequestBody AdapterRequest adapterRequest);

    @GetMapping(value = "/get_asset_info")
    List<AssetDto> getAssetsInfo(@RequestBody AdapterRequest adapterRequest);

    @RequestMapping(method = RequestMethod.GET, value = "/")
    void connect();

}
