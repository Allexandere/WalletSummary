package io.comet.ws.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssetDto {
    public double current_price;
    public String icon_url;
    public String id;
    public String name;
    public String quantity;
    public double relative_change_24h;
}
