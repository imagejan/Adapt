/*
 * Copyright (C) 2014 David Barry <david.barry at cancer.org.uk>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Adapt;

/**
 *
 * @author David Barry <david.barry at cancer.org.uk>
 */
public class UserVariables {

    private static int greyThresh = 20; // user-specified grey-level threshold used in conditional region dilation
    private static boolean genVis = false;
    private static final double blebDurThresh = 5.0; // minimum duration (in frames) of bleb to be considered in analysis
    private static int curveRange = 10;
    private static boolean useSigThresh = false;
    private static double spatialRes = 0.212; //timeRes in frames/minute, spatialRes in microns/pixel;
    private static double cutOffTime = 120.0;
    private static double cortexDepth = 0.6;
    private static boolean autoThreshold = true; // User-specifed threshold is used if set to false
    private static double tempFiltRad = 5.0; // radius of Gaussian filters used to smooth velocity and signal maps
    private static double sigThreshFact = 0.0;
    private static double spatFiltRad = 1.0; // radius of Gaussian filters used to smooth velocity and signal maps
    private static int erosion = 2;
    private static boolean getMorph = false;
    private static double timeRes = 216.0; // temporal resolution in frames per minute
    private static final double blebLenThresh = 0.05; // minimum normalised length of bleb to be considered in analysis
    private static double curveThresh = -20.0;
    private static boolean analyseProtrusions = false;
    private static double sigRecoveryThresh = 0.25;
    private static double gaussRad = 2.0;
    private static final boolean usedSmoothedVels = true;
    private static final int ovalRadius = 2;

    /**
     * Get the radius of circles drawn on bleb detection output movies
     * 
     * @return radius of circles
     */
    public static int getOvalRadius() {
        return ovalRadius;
    }

    /**
     * Returns true if velocity values are smoothed prior to being output
     * 
     * @return true if velocity values are filtered
     */
    public static boolean isUsedSmoothedVels() {
        return usedSmoothedVels;
    }

    /**
     * Get the minimum duration of a bleb to be considered in the analysis
     * 
     * @return minimum bleb duration in frames
     */
    public static double getBlebDurThresh() {
        return blebDurThresh;
    }

    /**
     * Get the minimum length of a bleb to be considered in the analysis
     * 
     * @return minimum bleb length, expressed as (min length)/(total cell length)
     */
    public static double getBlebLenThresh() {
        return blebLenThresh;
    }

    /**
     * Get grey level threshold used for manual image thresholding
     * 
     * @return grey level segmentation threshold
     */
    public static int getGreyThresh() {
        return greyThresh;
    }

    /**
     * Set grey level threshold used for manual image thresholding
     * 
     * @param greyThresh value of threshold to be used
     */
    public static void setGreyThresh(int greyThresh) {
        UserVariables.greyThresh = greyThresh;
    }

    /**
     * Returns true if visualisations are to be generated
     * 
     * @return true if visualisations are to be generated
     */
    public static boolean isGenVis() {
        return genVis;
    }

    /**
     * Set to true if visualisations are to be generated
     * 
     * @param genVis true to generate visualisations
     */
    public static void setGenVis(boolean genVis) {
        UserVariables.genVis = genVis;
    }

    /**
     * Get the pixel window over which curvature minima are searched for in cell
     * curvature maps
     * 
     * @return the width of the window in pixels
     */
    public static int getCurveRange() {
        return curveRange;
    }

    /**
     * Set the pixel window over which curvature minima are searched for in cell
     * curvature maps
     * 
     * @param curveRange the width of the window in pixels
     */
    public static void setCurveRange(int curveRange) {
        UserVariables.curveRange = curveRange;
    }

    /**
     * Returns true if a signal pixel values must be above a threshold to be 
     * included in analysis
     * 
     * @return true if signal threshold is used
     */
    public static boolean isUseSigThresh() {
        return useSigThresh;
    }

    /**
     * Set to true if a signal pixel values must be above a threshold to be 
     * included in analysis
     * 
     * @param useSigThresh true if signal threshold is used
     */
    public static void setUseSigThresh(boolean useSigThresh) {
        UserVariables.useSigThresh = useSigThresh;
    }

    /**
     * Get spatial resolution
     * 
     * @return spatial resolution in microns/pixel
     */
    public static double getSpatialRes() {
        return spatialRes;
    }

    /**
     * Set spatial resolution
     * 
     * @param spatialRes spatial resolution in microns/pixel
     */
    public static void setSpatialRes(double spatialRes) {
        UserVariables.spatialRes = spatialRes;
    }

    /**
     * Get the maximum length of time a bleb will be tracked
     * 
     * @return maximum tracking duration in seconds
     */
    public static double getCutOffTime() {
        return cutOffTime;
    }

    /**
     * Set the maximum length of time a bleb will be tracked
     * 
     * @param cutOffTime maximum tracking duration in seconds
     */
    public static void setCutOffTime(double cutOffTime) {
        UserVariables.cutOffTime = cutOffTime;
    }

    /**
     * Get the depth below cell surface that signal pixels will be summed over
     * 
     * @return cortex depth in microns
     */
    public static double getCortexDepth() {
        return cortexDepth;
    }

    /**
     * Set the depth below cell surface that signal pixels will be summed over
     * 
     * @param cortexDepth cortex depth in microns
     */
    public static void setCortexDepth(double cortexDepth) {
        UserVariables.cortexDepth = cortexDepth;
    }

    /**
     * Returns true if images are to be auto-thresholded
     * 
     * @return true if auto-thresholding is used
     */
    public static boolean isAutoThreshold() {
        return autoThreshold;
    }

    /**
     * Set to true if auto-thresholding of images is to be used
     * 
     * @param autoThreshold true if auto-thresholding is to be used
     */
    public static void setAutoThreshold(boolean autoThreshold) {
        UserVariables.autoThreshold = autoThreshold;
    }

    /**
     * Get the radius of the smoothing filter applied to {@link MorphMap MorphMaps}
     * in the temporal dimension
     * 
     * @return temporal radius of smoothing filter in seconds
     */
    public static double getTempFiltRad() {
        return tempFiltRad;
    }

    /**
     * Set the radius of the smoothing filter applied to {@link MorphMap MorphMaps}
     * in the temporal dimension
     * 
     * @param tempFiltRad temporal radius of smoothing filter in seconds
     */
    public static void setTempFiltRad(double tempFiltRad) {
        UserVariables.tempFiltRad = tempFiltRad;
    }

    /**
     * Get the signal threshold factor. The signal threshold is calculated as
     * (mean signal value in signal map) + (signal threshold factor) x (standard
     * deviation of values in signal map)
     * 
     * @return signal threshold factor
     */
    public static double getSigThreshFact() {
        return sigThreshFact;
    }

    /**
     * Set the signal threshold factor. The signal threshold is calculated as
     * (mean signal value in signal map) + (signal threshold factor) x (standard
     * deviation of values in signal map)
     * 
     * @param sigThreshFact signal threshold factor
     */
    public static void setSigThreshFact(double sigThreshFact) {
        UserVariables.sigThreshFact = sigThreshFact;
    }

    /**
     * Get the radius of the smoothing filter applied to {@link MorphMap MorphMaps}
     * in the spatial dimension
     * 
     * @return spatial radius of smoothing filter in seconds
     */
    public static double getSpatFiltRad() {
        return spatFiltRad;
    }

    /**
     * Get the radius of the smoothing filter applied to {@link MorphMap MorphMaps}
     * in the spatial dimension
     * 
     * @param spatFiltRad spatial radius of smoothing filter in seconds
     */
    public static void setSpatFiltRad(double spatFiltRad) {
        UserVariables.spatFiltRad = spatFiltRad;
    }

    /**
     * Get the number of erosion operations applied to a segmented cell in a given
     * frame before it is used as the seed for segmentation in the next frame
     * 
     * @return number of erosion operations
     */
    public static int getErosion() {
        return erosion;
    }

    /**
     * Set the number of erosion operations applied to a segmented cell in a given
     * frame before it is used as the seed for segmentation in the next frame
     * 
     * @param erosion number of erosion operations
     */
    public static void setErosion(int erosion) {
        UserVariables.erosion = erosion;
    }

    /**
     * Returns true if morphological data is to be generated
     * 
     * @return true if morphological data is to be generated
     */
    public static boolean isGetMorph() {
        return getMorph;
    }

    /**
     * Set to true if morphological data is to be generated
     * 
     * @param getMorph true if morphological data is to be generated
     */
    public static void setGetMorph(boolean getMorph) {
        UserVariables.getMorph = getMorph;
    }

    /**
     * Get time resolution
     * 
     * @return time resolution in frames per minute
     */
    public static double getTimeRes() {
        return timeRes;
    }

    /**
     * Set the time resolution
     * 
     * @param timeRes time resolution in frames per minute
     */
    public static void setTimeRes(double timeRes) {
        UserVariables.timeRes = timeRes;
    }

    /**
     * Get the threshold value used to locate curvature extrema in curvature maps
     * 
     * @return curvature threshold - extrema must be lower than this value to be
     * considered candidates for bleb anchor points
     */
    public static double getCurveThresh() {
        return curveThresh;
    }

    /**
     * Set the threshold value used to locate curvature extrema in curvature maps
     * 
     * @param curveThresh curvature threshold - extrema must be lower than this value to be
     * considered candidates for bleb anchor points
     */
    public static void setCurveThresh(double curveThresh) {
        UserVariables.curveThresh = curveThresh;
    }

    /**
     * Returns true if individual blebs are to be analysed
     * 
     * @return true if individual blebs are to be analysed
     */
    public static boolean isAnalyseProtrusions() {
        return analyseProtrusions;
    }

    /**
     * Set to true if individual blebs are to be analysed
     * 
     * @param analyseProtrusions true if individual blebs are to be analysed
     */
    public static void setAnalyseProtrusions(boolean analyseProtrusions) {
        UserVariables.analyseProtrusions = analyseProtrusions;
    }

    /**
     * Get the minimum fraction of pixels within a cortical signal region that
     * must be above the signal threshold for the bleb to be included in the analysis
     * 
     * @return recovery threshold, defined as (number of frames where at least one
     * pixel is above threshold) / (total number of frames)
     */
    public static double getSigRecoveryThresh() {
        return sigRecoveryThresh;
    }

    /**
     * Set the minimum fraction of pixels within a cortical signal region that
     * must be above the signal threshold for the bleb to be included in the analysis
     * 
     * @param sigRecoveryThresh recovery threshold, defined as (number of frames where at least one
     * pixel is above threshold) / (total number of frames)
     */
    public static void setSigRecoveryThresh(double sigRecoveryThresh) {
        UserVariables.sigRecoveryThresh = sigRecoveryThresh;
    }

    /**
     * Get the radius of the Gaussian filter used to denoise individual cyto
     * frames
     * 
     * @return standard deviation of Gaussian filter in pixels
     */
    public static double getGaussRad() {
        return gaussRad;
    }

    /**
     * Set the radius of the Gaussian filter used to denoise individual cyto
     * frames
     * 
     * @param gaussRad  standard deviation of Gaussian filter in pixels
     */
    public static void setGaussRad(double gaussRad) {
        UserVariables.gaussRad = gaussRad;
    }

}