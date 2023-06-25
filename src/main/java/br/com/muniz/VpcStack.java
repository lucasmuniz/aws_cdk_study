package br.com.muniz;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.ec2.Vpc;
import software.constructs.Construct;

public class VpcStack extends Stack {

    private Vpc vpc;

    public VpcStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public VpcStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        this.vpc = Vpc.Builder.create(this, "Vpc01")
                .maxAzs(3)
                .natGateways(0) //desabilitada o NatGateway (não usar em PRD, esse modo é só pra economizar $)
                .build();
    }

    public Vpc getVpc() {
        return vpc;
    }
}
