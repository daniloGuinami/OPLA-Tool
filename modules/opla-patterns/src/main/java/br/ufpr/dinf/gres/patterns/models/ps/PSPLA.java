package br.ufpr.dinf.gres.patterns.models.ps;

import br.ufpr.dinf.gres.patterns.designpatterns.DesignPattern;

/**
 * The Interface PSPLA.
 */
public interface PSPLA extends PS {

    /**
     * Gets the PSPLA of.
     *
     * @return the PSPLA of
     */
    DesignPattern getPSPLAOf();

    /**
     * Checks if is PSPLA of.
     *
     * @param designPattern the design pattern
     * @return true, if is PSPLA of
     */
    boolean isPSPLAOf(DesignPattern designPattern);

}
