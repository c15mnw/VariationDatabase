<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

      <h2><spring:message code="spring.data.jpa.variation.search.about"/></h2>
      <br /><br />
      
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut feugiat varius ipsum feugiat suscipit. Quisque faucibus urna a urna lacinia porta. Aliquam finibus justo in risus commodo tristique. Aenean aliquet, ipsum sed vehicula malesuada, dolor nisl viverra lorem, tempor porttitor odio nisl sed massa. Proin lacinia dapibus mollis. In at ipsum ante. Duis pharetra mollis arcu id congue. Donec laoreet ex lacus, eget suscipit arcu tempor id. Vivamus in tortor tempus, interdum enim at, tincidunt velit. Quisque elit eros, sagittis sit amet luctus vitae, tempus eu metus. Donec et quam pellentesque, laoreet orci id, dignissim ipsum. Integer tellus odio, cursus eget quam nec, imperdiet elementum sem.</p>

      <p><strong><a href="http://dnaresearch.oxfordjournals.org/content/early/2015/04/28/dnares.dsv005.full" style="color:#000000;" target="_blank">&quot;Functional classification of 15 million SNPs detected from diverse chicken populations&quot;</a></strong>,<br/>
      Gheyas AA, Boschiero C, Eory L, Ralph H, Kuo R, Woolliams JA and Burt DW, <br />
      <strong>DNA Research</strong> <em>Vol.22</em>, <em>No.3</em>, <em>pp.205--217</em>, 2015.</p>

      <p><strong><a href="http://bmcgenomics.biomedcentral.com/articles/10.1186/s12864-015-1711-1" style="color:#000000;" target="_blank">&quot;Detection and characterization of novel short insertion and deletion polymorphisms from chicken genome&quot;</a></strong>,<br/>
      Boschiero C, Gheyas AA, Ralph HK, Eory L, Paton B, Kuo R, Fulton J, Preisinger R, Kaiser P and Burt DW,<br />
      <strong>BMC Genomics</strong> <em>Vol.16</em>, <em>No.1</em>, <em>pp.1--17</em>, 2015.</p>

      <hr>

      <h2>The Search Page</h2>
      <br /><br />
      
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut feugiat varius ipsum feugiat suscipit. Quisque faucibus urna a urna lacinia porta. Aliquam finibus justo in risus commodo tristique. Aenean aliquet, ipsum sed vehicula malesuada, dolor nisl viverra lorem, tempor porttitor odio nisl sed massa. Proin lacinia dapibus mollis. In at ipsum ante. Duis pharetra mollis arcu id congue. Donec laoreet ex lacus, eget suscipit arcu tempor id. Vivamus in tortor tempus, interdum enim at, tincidunt velit. Quisque elit eros, sagittis sit amet luctus vitae, tempus eu metus. Donec et quam pellentesque, laoreet orci id, dignissim ipsum. Integer tellus odio, cursus eget quam nec, imperdiet elementum sem.</p>

      <hr>

<h4>SEARCH By Gene Name WITH Upstream AND Downstream Ranges</h4>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p>If a <em>Chromosome</em> with <em>Start (LOW) Co-ordinate</em> and <em>End (HIGH) Co-ordinate</em> is not supplied, then an <em>Ensembl Gene Name</em> <strong>MUST BE SUPPLIED</strong>.</p>
      <br />
      
<a id="ensemblGeneName"></a>
<h5>1. Ensembl Gene Name</h5>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p><em>A Reference would be useful here?</em></p>
      <br />
      
<a id="addDownstreamRange"></a>
<h5>2. Additional Downstream Range</h5>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>

      <p>The <em>Additional Downstream Range</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
      <p>The Ensembl Gene Coordinate Range combined with the Additional Upstream and Downstream Ranges, must <strong>NOT BE GREATER THAN 10,000 Base Pairs</strong>.</p>
      <br />

<a id="addUpstreamRange"></a>
<h5>3. Additional Upstream Range</h5>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />

      <p>The <em>Additional Upstream Range</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
      <p>The Ensembl Gene Coordinate Range combined with the Additional Upstream and Downstream Ranges, must <strong>NOT BE GREATER THAN 10,000 Base Pairs</strong>.</p>
      <br />

      <hr>

<h4>SEARCH By Chromosome Id WITH Genomic Location</h4>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p>If an <em>Ensembl Gene Name</em> is not supplied, then a <em>Chromosome</em> with <em>Start (LOW) Co-ordinate</em> and <em>End (HIGH) Co-ordinate</em> <strong>MUST BE SUPPLIED</strong>.</p>
      <br />
      
<a id="chromosomeId"></a>
<h5>4. Chromosome Id</h5>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p>There are <strong>32</strong> Chromosomes to choose from:<br /><strong>1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 32, LGE22C19W28_E50C23, LGE64, W</strong> and <strong>Z</strong>.</p>
      <br />
      
<a id="startLowCoordinate"></a>
<h5>5. Start (LOW) Co-ordinate</h5>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p>The <em>Start (LOW) Co-ordinate</em> must be a <strong>NUMBER</strong>, and <strong>MUST BE LOWER</strong> than the <em>End Co-ordinate</em>.</p>
      <p>The Co-ordinate Range, between the supplied Start and End Co-ordinates, <strong>MUST NOT BE GREATER THAN 1,000,000 Base Pairs</strong>.</p>
      <br />

<a id="endHighCoordinate"></a>
<h5>6. End (HIGH) Co-ordinate</h5>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p>The <em>End (HIGH) Co-ordinate</em> must be a <strong>NUMBER</strong>, and <strong>MUST BE HIGHER</strong> than the <em>Start Co-ordinate</em>.</p>
      <p>The Co-ordinate Range, between the supplied Start and End Co-ordinates, <strong>MUST NOT BE GREATER THAN 1,000,000 Base Pairs</strong>.</p>
      </p>
      <br />

      <hr>

<h4>Mandatory Search Fields</h4>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />

<a id="referenceAllele"></a>
<h5>7. Reference Allele</h5>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p>There are <strong>7</strong> Strains to choose from as a <em>Reference Allele</em>:<br /><strong>7, P, W, N, 15I, Zero, 6</strong> and <strong>C</strong>.</p>
      <p>The Strain selected for the <em>Reference Allele</em> <strong>MUST NOT BE EQUAL TO</strong> the Strain selected for the <em>Alternative Allele</em>; and is <strong>MANDATORY</strong>.</p>
      <br />

<a id="alternativeAllele"></a>
<h5>8. Alternative Allele</h5>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p>There are <strong>7</strong> Strains to choose from as an <em>Alternative Allele</em>:<br /><strong>7, P, W, N, 15I, Zero, 6</strong> and <strong>C</strong>.</p>
      <p>The Strain selected for the <em>Alternative Allele</em> <strong>MUST NOT BE EQUAL TO</strong> the Strain selected for the <em>Reference Allele</em>; and is <strong>MANDATORY</strong>.</p>
      <br />

      <hr>

<h4>Optional Search Filters</h4>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />

<h5>9. SIFT Score</h5>
<a id="siftScore"></a>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p>The <em>SIFT Score</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
      <br />

<h5>10. PROVEAN Score</h5>
<a id="proveanScore"></a>

      <br />

      <p><strong>PROVEAN</strong> (Protein Variation Effect Analyzer) score is a metric that predicts the damaging effects of variants such as SNPs, in-frame InDels, and block substitutions on protein functions.
      It is an alignment-based score (also called Delta alignment score) that measures the change in sequence similarity of a query sequence to a protein sequence homolog before and after the introduction of an amino acid variation to the query sequence. 
      Although estimated scores are considered to be correlated with the deleteriousness of the variants, a cut-off point is used for declaring variants as “Intolerant” in evolutionary terms. 
      For predicting the effects of the variants in this database, PROVEAN was run with the default parameters on the NCBI non-redundant protein database. 
      Delta score of -2.5 was used as the threshold below which any variant was considered “Intolerant” or “Deleterious”. </p>

      <br />
      
      <p>Further information on <strong>PROVEAN</strong> can be found in the paper referenced below:</p>
      
      <p><strong><a href="http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0046688" style="color:#000000;" target="_blank">&quot;Predicting the functional effect of amino acid substitutions and indels&quot;</a></strong>,<br/>
      Choi Y, Sims GE, Murphy S, Miller JR. and Chan AP, <br />
      <strong>Plos ONE</strong> <em>Vol.7</em>, <em>No.10</em>, <em>pp.1--13</em>, 2012.</p>

      <br />
      
      <p>The <em>PROVEAN Score</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
      <br />

<h5>11. SIFT Conservation Score</h5>
<a id="siftConsScore"></a>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p>The <em>SIFT Conservation Score</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
      <br />

<h5>12. Protein Alignment Number</h5>
<a id="proteinAlignNum"></a>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p>The <em>Protein Alignment Number</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
      <br />
      
<h5>13. Total Number of Sequence Aligned</h5>
<a id="totNumSeqAligned"></a>
      <br />
      <p>Praesent sed blandit arcu. Duis viverra mattis sollicitudin. Pellentesque orci lorem, convallis ut diam non, sagittis fermentum lorem. Donec aliquam leo ac elit pellentesque ultricies. Donec lacinia at lacus quis pretium. Sed nec tellus vitae lorem semper iaculis. Ut velit odio, euismod et libero ut, dictum viverra velit. Morbi sollicitudin turpis diam, nec auctor nunc pulvinar in. Quisque sit amet dui sit amet nisi convallis condimentum at vitae metus. Maecenas pulvinar molestie vulputate. Morbi et eros accumsan, egestas arcu sed, posuere libero.</p>
      <br />
      <p>The <em>Total Number of Sequence Aligned</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
      <br />

      <hr>
        
      <h5>Contact Us</h5>
        <a href="../mailto:narf@roslin.ed.ac.uk" class="red">narf@roslin.ed.ac.uk</a>
      
    
    