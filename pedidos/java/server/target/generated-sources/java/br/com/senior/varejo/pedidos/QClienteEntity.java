package br.com.senior.varejo.pedidos;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QClienteEntity is a Querydsl query type for ClienteEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClienteEntity extends EntityPathBase<ClienteEntity> {

    private static final long serialVersionUID = 395640805L;

    public static final QClienteEntity clienteEntity = new QClienteEntity("clienteEntity");

    public final br.com.senior.messaging.customspringdata.QCustomEntity _super = new br.com.senior.messaging.customspringdata.QCustomEntity(this);

    public final StringPath cpf = createString("cpf");

    public final BooleanPath creditoHabilitado = createBoolean("creditoHabilitado");

    //inherited
    public final SimplePath<org.w3c.dom.Document> custom = _super.custom;

    public final DatePath<java.time.LocalDate> dataNascimento = createDate("dataNascimento", java.time.LocalDate.class);

    public final StringPath id = createString("id");

    public final StringPath nome = createString("nome");

    public QClienteEntity(String variable) {
        super(ClienteEntity.class, forVariable(variable));
    }

    public QClienteEntity(Path<? extends ClienteEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClienteEntity(PathMetadata metadata) {
        super(ClienteEntity.class, metadata);
    }

}

