<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<div class="row spacer">

    <div class="span12">

<form:form action="${pageContext.request.contextPath}/search" commandName="dtoSearch" method="POST">

    <fieldset>
    
        <legend><spring:message code="snpchromosome.search.form.legend"/></legend>

        <div class="row">
            <div class="span4">

                <div>
        <h3><spring:message code="snpchromosome.search.form.subtitle0"/></h3>
        <p><strong><spring:message code="snpchromosome.search.form.subtitle1"/></strong></p>
                </div>

            </div><!-- close span4 --> 
            <div class="span4">

                <div>
        <h3><spring:message code="snpchromosome.search.form.subtitle2"/></h3>
        <p><strong><spring:message code="snpchromosome.search.form.subtitle3"/></strong></p>
                </div>

            </div><!-- close span4 --> 
            <div class="span4">

                <div>
        <h3><spring:message code="snpchromosome.search.form.subtitle4"/></h3>

        <p><strong><spring:message code="snpchromosome.search.form.subtitle5"/></strong></p>
                </div>

            </div><!-- close span4 --> 
        
        </div><!-- close row -->
        
        <div class="row">
            <div class="span4">

                <div class="spacer">
            <form:label path="searchGeneName"><spring:message code="snpchromosome.search.searchGeneName.label"/></form:label>
            <form:input path="searchGeneName" type="text"/>
                </div><!-- close spacer --> 
        
<script>
$("#searchGeneName").autocomplete("${pageContext.request.contextPath}/getEnsemblIds.jsp");
</script>

            </div><!-- close span4 --> 
            <div class="span4">

                <div class="spacer">
            <form:label path="SearchChromosome"><spring:message code="snpchromosome.search.searchchromosome.label"/></form:label>
            <form:select path="SearchChromosome">
                <form:option value="CHROMOSOME_NONE"><spring:message code="SearchChromosome.CHROMOSOME_NONE"/></form:option>
                <form:option value="CHROMOSOME_1"><spring:message code="SearchChromosome.CHROMOSOME_1"/></form:option>
                <form:option value="CHROMOSOME_3"><spring:message code="SearchChromosome.CHROMOSOME_3"/></form:option>
                <form:option value="CHROMOSOME_4"><spring:message code="SearchChromosome.CHROMOSOME_4"/></form:option>
                <form:option value="CHROMOSOME_5"><spring:message code="SearchChromosome.CHROMOSOME_5"/></form:option>
                <form:option value="CHROMOSOME_6"><spring:message code="SearchChromosome.CHROMOSOME_6"/></form:option>
                <form:option value="CHROMOSOME_7"><spring:message code="SearchChromosome.CHROMOSOME_7"/></form:option>
                <form:option value="CHROMOSOME_8"><spring:message code="SearchChromosome.CHROMOSOME_8"/></form:option>
                <form:option value="CHROMOSOME_9"><spring:message code="SearchChromosome.CHROMOSOME_9"/></form:option>
                <form:option value="CHROMOSOME_10"><spring:message code="SearchChromosome.CHROMOSOME_10"/></form:option>
                <form:option value="CHROMOSOME_11"><spring:message code="SearchChromosome.CHROMOSOME_11"/></form:option>
                <form:option value="CHROMOSOME_12"><spring:message code="SearchChromosome.CHROMOSOME_12"/></form:option>
                <form:option value="CHROMOSOME_13"><spring:message code="SearchChromosome.CHROMOSOME_13"/></form:option>
                <form:option value="CHROMOSOME_14"><spring:message code="SearchChromosome.CHROMOSOME_14"/></form:option>
                <form:option value="CHROMOSOME_15"><spring:message code="SearchChromosome.CHROMOSOME_15"/></form:option>
                <form:option value="CHROMOSOME_16"><spring:message code="SearchChromosome.CHROMOSOME_16"/></form:option>
                <form:option value="CHROMOSOME_17"><spring:message code="SearchChromosome.CHROMOSOME_17"/></form:option>
                <form:option value="CHROMOSOME_18"><spring:message code="SearchChromosome.CHROMOSOME_18"/></form:option>
                <form:option value="CHROMOSOME_19"><spring:message code="SearchChromosome.CHROMOSOME_19"/></form:option>
                <form:option value="CHROMOSOME_20"><spring:message code="SearchChromosome.CHROMOSOME_20"/></form:option>
                <form:option value="CHROMOSOME_21"><spring:message code="SearchChromosome.CHROMOSOME_21"/></form:option>
                <form:option value="CHROMOSOME_22"><spring:message code="SearchChromosome.CHROMOSOME_22"/></form:option>
                <form:option value="CHROMOSOME_23"><spring:message code="SearchChromosome.CHROMOSOME_23"/></form:option>
                <form:option value="CHROMOSOME_24"><spring:message code="SearchChromosome.CHROMOSOME_24"/></form:option>
                <form:option value="CHROMOSOME_25"><spring:message code="SearchChromosome.CHROMOSOME_25"/></form:option>
                <form:option value="CHROMOSOME_26"><spring:message code="SearchChromosome.CHROMOSOME_26"/></form:option>
                <form:option value="CHROMOSOME_27"><spring:message code="SearchChromosome.CHROMOSOME_27"/></form:option>
                <form:option value="CHROMOSOME_28"><spring:message code="SearchChromosome.CHROMOSOME_28"/></form:option>
                <form:option value="CHROMOSOME_32"><spring:message code="SearchChromosome.CHROMOSOME_32"/></form:option>
                <form:option value="CHROMOSOME_LGE22C19W28_E50C23"><spring:message code="SearchChromosome.CHROMOSOME_LGE22C19W28_E50C23"/></form:option>
                <form:option value="CHROMOSOME_LGE64"><spring:message code="SearchChromosome.CHROMOSOME_LGE64"/></form:option>
                <form:option value="CHROMOSOME_W"><spring:message code="SearchChromosome.CHROMOSOME_W"/></form:option>
                <form:option value="CHROMOSOME_Z"><spring:message code="SearchChromosome.CHROMOSOME_Z"/></form:option>
            </form:select>
                </div><!-- close spacer --> 
                
            </div><!-- close span4 --> 
            <div class="span4">

               <div class="spacer">
            <form:label path="SearchReference"><spring:message code="snpchromosome.search.searchreference.label"/></form:label>
            <form:select path="SearchReference">
                <form:option value="STRAIN_NONE"><spring:message code="SearchReference.STRAIN_NONE"/></form:option>
                <form:option value="STRAIN_7"><spring:message code="SearchReference.STRAIN_7"/></form:option>
                <form:option value="STRAIN_P"><spring:message code="SearchReference.STRAIN_P"/></form:option>
                <form:option value="STRAIN_W"><spring:message code="SearchReference.STRAIN_W"/></form:option>
                <form:option value="STRAIN_N"><spring:message code="SearchReference.STRAIN_N"/></form:option>
                <form:option value="STRAIN_15I"><spring:message code="SearchReference.STRAIN_15I"/></form:option>
                <form:option value="STRAIN_ZERO"><spring:message code="SearchReference.STRAIN_ZERO"/></form:option>
                <form:option value="STRAIN_6"><spring:message code="SearchReference.STRAIN_6"/></form:option>
                <form:option value="STRAIN_C"><spring:message code="SearchReference.STRAIN_C"/></form:option>
            </form:select>
                </div><!-- close spacer --> 

            </div><!-- close span4 --> 
        </div><!-- close row -->
        
        <div class="row">
            <div class="span4">
                
                <div>
            <form:label path="searchDownStream"><spring:message code="snpchromosome.search.searchDownStream.label"/></form:label>
            <form:input class="input-large" path="searchDownStream" type="text"/>
                </div>
                
            </div><!-- close span4 --> 
            <div class="span4">

                <div>
            <form:label path="searchLowRange"><spring:message code="snpchromosome.search.searchlowrange.label"/></form:label>
            <form:input class="input-large" path="searchLowRange" type="text"/>
                </div>
        
            </div><!-- close span4 --> 
            <div class="span4">

               <div>
            <form:label path="SearchAlternative"><spring:message code="snpchromosome.search.searchalternative.label"/></form:label>
            <form:select path="SearchAlternative">
                <form:option value="STRAIN_NONE"><spring:message code="SearchAlternative.STRAIN_NONE"/></form:option>
                <form:option value="STRAIN_7"><spring:message code="SearchAlternative.STRAIN_7"/></form:option>
                <form:option value="STRAIN_P"><spring:message code="SearchAlternative.STRAIN_P"/></form:option>
                <form:option value="STRAIN_W"><spring:message code="SearchAlternative.STRAIN_W"/></form:option>
                <form:option value="STRAIN_N"><spring:message code="SearchAlternative.STRAIN_N"/></form:option>
                <form:option value="STRAIN_15I"><spring:message code="SearchAlternative.STRAIN_15I"/></form:option>
                <form:option value="STRAIN_ZERO"><spring:message code="SearchAlternative.STRAIN_ZERO"/></form:option>
                <form:option value="STRAIN_6"><spring:message code="SearchAlternative.STRAIN_6"/></form:option>
                <form:option value="STRAIN_C"><spring:message code="SearchAlternative.STRAIN_C"/></form:option>
            </form:select>
                </div>

            </div><!-- close span4 --> 
        </div><!-- close row -->
        
        <div class="row">
            <div class="span4">

                <div>
            <form:label path="searchUpStream"><spring:message code="snpchromosome.search.searchUpStream.label"/></form:label>
            <form:input class="input-large" path="searchUpStream" type="text"/>
                </div><!-- close spacer --> 
                
            </div><!-- close span4 --> 
            <div class="span4">

                <div>
            <form:label path="searchHighRange"><spring:message code="snpchromosome.search.searchhighrange.label"/></form:label>
            <form:input class="input-large" path="searchHighRange" type="text"/>
                </div> 
        
            </div><!-- close span4 --> 
            <div class="span4">

                <div>
                </div><!-- close spacer --> 
        
            </div><!-- close span4 -->
        </div><!-- close row -->
        
        <div class="row spacer">
            <div class="span12">
            </div><!-- close span12 -->
        </div><!-- close row spacer -->
        
        <div id="legend1" onclick="document.getElementById('filterform1').style.display= 'initial';">
        <legend><spring:message code="snpchromosome.search.filter.form.legend"/></legend>
        </div>

        <div id="filterform1" style="display: none;">

        <div class="row">
            <div class="span4">

                <div>
        <h3><spring:message code="snpchromosome.search.filter.form.subtitle0"/></h3>
        <!-- <p><strong><spring:message code="snpchromosome.search.filter.form.subtitle1"/></strong></p> -->
                </div><!-- close spacer --> 
                
            </div><!-- close span4 --> 
            <div class="span4">

                <div>
                </div> 
        
            </div><!-- close span4 --> 
            <div class="span4">

                <div>
                </div><!-- close spacer --> 
        
            </div><!-- close span4 -->
        </div><!-- close row -->

<div class="row spacer">
<div class="span4">
<table width="100%" border="0">
  <tr>
    <td>
            <form:label path="searchFilterSiftScoreValue"><spring:message code="snpchromosome.search.filter.searchFilterSiftScore.label"/></form:label>
    </td>
    <td>
            <form:label path="SearchFilterSiftScore"><spring:message code="SearchFilterSiftScore.SIFT_SCORE_ABOVE"/></form:label>
    </td>
    <td>
            <form:label path="SearchFilterSiftScore"><spring:message code="SearchFilterSiftScore.SIFT_SCORE_BELOW"/></form:label>
    </td>
  </tr>
  <tr>
    <td>
            <form:input class="input-small" path="searchFilterSiftScoreValue" type="text"/>
    </td>
    <td>
            <form:radiobutton path="SearchFilterSiftScore" value="SIFT_SCORE_ABOVE"/>
    </td>
    <td>
            <form:radiobutton path="SearchFilterSiftScore" value="SIFT_SCORE_BELOW"/>
    </td>
  </tr>
</table>
</div><!-- close span4 -->

<div class="span4">
<table width="100%" border="0">
  <tr>
    <td>
            <form:label path="searchFilterProveanScoreValue"><spring:message code="snpchromosome.search.filter.searchFilterProveanScore.label"/></form:label>
    </td>
    <td>
            <form:label path="SearchFilterProveanScore"><spring:message code="SearchFilterProveanScore.PROVEAN_SCORE_ABOVE"/></form:label>
    </td>
    <td>
            <form:label path="SearchFilterProveanScore"><spring:message code="SearchFilterProveanScore.PROVEAN_SCORE_BELOW"/></form:label>
    </td>
  </tr>
  <tr>
    <td>
            <form:input class="input-small" path="searchFilterProveanScoreValue" type="text"/>
    </td>
    <td>
            <form:radiobutton path="SearchFilterProveanScore" value="PROVEAN_SCORE_ABOVE"/>
    </td>
    <td>
            <form:radiobutton path="SearchFilterProveanScore" value="PROVEAN_SCORE_BELOW"/>
    </td>
  </tr>
</table>
</div><!-- close span4 -->

<div class="span4">
<table width="100%" border="0">
  <tr>
    <td>
            <form:label path="searchFilterSiftConservationScoreValue"><spring:message code="snpchromosome.search.filter.searchFilterSiftConservationScore.label"/></form:label>
    </td>
    <td>
            <form:label path="SearchFilterSiftConservationScore"><spring:message code="SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_ABOVE"/></form:label>
    </td>
    <td>
            <form:label path="SearchFilterSiftConservationScore"><spring:message code="SearchFilterSiftConservationScore.SIFT_CONSERVATION_SCORE_BELOW"/></form:label>
    </td>
  </tr>
  <tr>
    <td>
            <form:input class="input-small" path="searchFilterSiftConservationScoreValue" type="text"/>
    </td>
    <td>
            <form:radiobutton path="SearchFilterSiftConservationScore" value="SIFT_CONSERVATION_SCORE_ABOVE"/>
    </td>
    <td>
            <form:radiobutton path="SearchFilterSiftConservationScore" value="SIFT_CONSERVATION_SCORE_BELOW"/>
    </td>
  </tr>
</table>
</div><!-- close span4 -->
</div><!-- close row spacer -->

<div class="row spacer">
<div class="span4">
<table width="100%" border="0">
  <tr>
    <td>
            <form:label path="searchFilterProteinAlignNumberValue"><spring:message code="snpchromosome.search.filter.searchFilterProteinAlignNumber.label"/></form:label>
    </td>
    <td>
            <form:label path="SearchFilterProteinAlignNumber"><spring:message code="SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_ABOVE"/></form:label>
    </td>
    <td>
            <form:label path="SearchFilterProteinAlignNumber"><spring:message code="SearchFilterProteinAlignNumber.PROTEIN_ALIGN_NUMBER_BELOW"/></form:label>
    </td>
  </tr>
  <tr>
    <td>
            <form:input class="input-small" path="searchFilterProteinAlignNumberValue" type="text"/>
    </td>
    <td>
            <form:radiobutton path="SearchFilterProteinAlignNumber" value="PROTEIN_ALIGN_NUMBER_ABOVE"/>
    </td>
    <td>
            <form:radiobutton path="SearchFilterProteinAlignNumber" value="PROTEIN_ALIGN_NUMBER_BELOW"/>
    </td>
  </tr>
</table>
</div><!-- close span4 -->

<div class="span4">
<table width="100%" border="0">
  <tr>
    <td>
            <form:label path="searchFilterTotalNumberSeqAlignedValue"><spring:message code="snpchromosome.search.filter.searchFilterTotalNumberSeqAligned.label"/></form:label>
    </td>
    <td>
            <form:label path="SearchFilterTotalNumberSeqAligned"><spring:message code="SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_ABOVE"/></form:label>
    </td>
    <td>
            <form:label path="SearchFilterTotalNumberSeqAligned"><spring:message code="SearchFilterTotalNumberSeqAligned.TOTAL_NUMBER_SEQ_ALIGNED_BELOW"/></form:label>
    </td>
  </tr>
  <tr>
    <td>
            <form:input class="input-small" path="searchFilterTotalNumberSeqAlignedValue" type="text"/>
    </td>
    <td>
            <form:radiobutton path="SearchFilterTotalNumberSeqAligned" value="TOTAL_NUMBER_SEQ_ALIGNED_ABOVE"/>
    </td>
    <td>
            <form:radiobutton path="SearchFilterTotalNumberSeqAligned" value="TOTAL_NUMBER_SEQ_ALIGNED_BELOW"/>
    </td>
  </tr>
</table>
</div><!-- close span4 -->

<div class="span4">
</div><!-- close span4 -->
</div><!-- close row spacer -->

        </div><!-- close filterform1 -->
        
        <div class="row spacer">
            <div class="span12">
                <input type="submit" value="<spring:message code="snpchromosome.search.form.submit.label"/>"/>
            </div><!-- close span12 -->
        
        </div><!-- close row spacer -->

    </fieldset>
    
</form:form>

    </div><!-- close span12 -->    
    
</div><!-- close row --> 
