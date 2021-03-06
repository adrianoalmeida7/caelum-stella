/**
 * 
 */
package br.com.caelum.stella.nfe.modelo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import net.vidageek.fluid.annotations.FluidDataType;
import net.vidageek.fluid.annotations.FluidName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COFINSOutr ", propOrder = { "cst", "vbc", "pcofins", "qbcProd", "vAliqProd", "vcofins" })
@FluidName("COFINSOutrasOperacoes")
public class COFINSOutr {

    @XmlElement(name = "CST", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @FluidName("codigoSituacaoTributaria")
    protected String codigoSituacaoTributaria;

    @XmlElement(name = "vBC")
    @FluidName("valorDaBaseDeCalculo")
    @FluidDataType(BigDecimal.class)
    protected String valorDaBaseDeCalculo;

    @XmlElement(name = "pCOFINS")
    @FluidName("aliquotaEmPercentual")
    @FluidDataType(BigDecimal.class)
    protected String aliquotaEmPercentual;

    @XmlElement(name = "qbcProd")
    @FluidName("quantidadeVendida")
    protected String quantidadeVendida;

    @XmlElement(name = "vAliqProd")
    @FluidName("aliquota")
    protected String aliquota;

    @XmlElement(name = "vCOFINS", required = true)
    @FluidName("valor")
    protected String valor;

    public String getCodigoSituacaoTributaria() {
        return codigoSituacaoTributaria;
    }

    public void setCodigoSituacaoTributaria(final String codigoSituacaoTributaria) {
        this.codigoSituacaoTributaria = codigoSituacaoTributaria;
    }

    public String getvalorDaBaseDeCalculo() {
        return valorDaBaseDeCalculo;
    }

    public void setvalorDaBaseDeCalculo(final String valorDaBaseDeCalculo) {
        this.valorDaBaseDeCalculo = valorDaBaseDeCalculo;
    }

    public String getAliquotaEmPercentual() {
        return aliquotaEmPercentual;
    }

    public void setAliquotaEmPercentual(final String aliquotaEmPercentual) {
        this.aliquotaEmPercentual = aliquotaEmPercentual;
    }

    public String getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(final String quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public String getAliquota() {
        return aliquota;
    }

    public void setAliquota(final String aliquota) {
        this.aliquota = aliquota;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(final String valor) {
        this.valor = valor;
    }

}