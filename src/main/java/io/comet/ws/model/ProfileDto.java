package io.comet.ws.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDto {
    public double absolute_change_24h;
    public double assets_value;
    public double relative_change_24h;
}
