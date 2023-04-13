package io.qpointz.rapids.calcite;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.calcite.avatica.Meta;
import org.apache.calcite.avatica.jdbc.JdbcMeta;
import org.apache.calcite.jdbc.CalciteConnection;
import org.apache.calcite.rel.type.RelDataTypeFactory;
import org.apache.calcite.schema.SchemaPlus;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@Slf4j
public class StandardCalciteHanlder implements SchemaPlusCalciteHandler  {

    private final Properties properties;

    private static final String jdbcUrl = "jdbc:calcite:";

    @Getter(lazy = true)
    private final CalciteConnection calciteConnection = createCalciteConnection();

    private CalciteConnection createCalciteConnection() throws SQLException {
        var connection = DriverManager.getConnection(jdbcUrl, this.properties);
        return connection.unwrap(CalciteConnection.class);
    }


    public StandardCalciteHanlder(Properties defaultProperties) throws ClassNotFoundException, SQLException {
        log.debug("Resolve calcite JDBC classes");
        Class.forName("org.apache.calcite.jdbc.Driver");
        this.properties = new Properties();
        this.properties.putAll(defaultProperties);
    }

    @Override
    public Meta getMeta() {
        try {
            return new JdbcMeta(StandardCalciteHanlder.jdbcUrl, this.properties);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public SchemaPlus getRootSchema() {
        return this.calciteConnection.getRootSchema();
    }

    @Override
    public RelDataTypeFactory getTypeFactory() {
        return this.calciteConnection.getTypeFactory();
    }
}
