package uk.ac.diamond.ispyb.mapper;

import org.modelmapper.spi.NameTransformer;
import org.modelmapper.spi.NameableType;

import java.util.function.Function;

public class StringReplacingNameTransformer implements NameTransformer {
    private final NameTransformer delegate;
    private final Function<String, String> converter;

    public StringReplacingNameTransformer(NameTransformer delegate, Function<String, String> converter) {
        this.delegate = delegate;
        this.converter = converter;
    }

    @Override
    public String transform(String input, NameableType nameableType) {
        return this.delegate.transform(this.converter.apply(input), nameableType);
    }
}
