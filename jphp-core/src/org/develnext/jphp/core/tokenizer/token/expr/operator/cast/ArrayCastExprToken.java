package org.develnext.jphp.core.tokenizer.token.expr.operator.cast;

import php.runtime.Memory;
import org.develnext.jphp.core.tokenizer.TokenMeta;
import org.develnext.jphp.core.tokenizer.TokenType;

public class ArrayCastExprToken extends CastExprToken {
    public ArrayCastExprToken(TokenMeta meta) {
        super(meta, TokenType.T_ARRAY_CAST);
    }

    @Override
    public Class<?> getResultClass() {
        return Memory.class;
    }

    @Override
    public Memory calc(Memory o1, Memory o2) {
        return o1.toArray();
    }

    @Override
    public String getCode() {
        return "toArray";
    }
}
