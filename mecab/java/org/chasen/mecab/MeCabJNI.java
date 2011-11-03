/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.chasen.mecab;

class MeCabJNI {
  public final static native String DictionaryInfo_filename_get(long jarg1, DictionaryInfo jarg1_);
  public final static native String DictionaryInfo_charset_get(long jarg1, DictionaryInfo jarg1_);
  public final static native long DictionaryInfo_size_get(long jarg1, DictionaryInfo jarg1_);
  public final static native int DictionaryInfo_type_get(long jarg1, DictionaryInfo jarg1_);
  public final static native long DictionaryInfo_lsize_get(long jarg1, DictionaryInfo jarg1_);
  public final static native long DictionaryInfo_rsize_get(long jarg1, DictionaryInfo jarg1_);
  public final static native int DictionaryInfo_version_get(long jarg1, DictionaryInfo jarg1_);
  public final static native long DictionaryInfo_next_get(long jarg1, DictionaryInfo jarg1_);
  public final static native long new_DictionaryInfo();
  public final static native void delete_DictionaryInfo(long jarg1);
  public final static native long Path_rnode_get(long jarg1, Path jarg1_);
  public final static native long Path_rnext_get(long jarg1, Path jarg1_);
  public final static native long Path_lnode_get(long jarg1, Path jarg1_);
  public final static native long Path_lnext_get(long jarg1, Path jarg1_);
  public final static native int Path_cost_get(long jarg1, Path jarg1_);
  public final static native void Path_prob_set(long jarg1, Path jarg1_, float jarg2);
  public final static native float Path_prob_get(long jarg1, Path jarg1_);
  public final static native int Token_lcAttr_get(long jarg1, Token jarg1_);
  public final static native int Token_rcAttr_get(long jarg1, Token jarg1_);
  public final static native int Token_posid_get(long jarg1, Token jarg1_);
  public final static native short Token_wcost_get(long jarg1, Token jarg1_);
  public final static native long Token_feature_get(long jarg1, Token jarg1_);
  public final static native long Token_compound_get(long jarg1, Token jarg1_);
  public final static native long Node_prev_get(long jarg1, Node jarg1_);
  public final static native long Node_next_get(long jarg1, Node jarg1_);
  public final static native long Node_enext_get(long jarg1, Node jarg1_);
  public final static native long Node_bnext_get(long jarg1, Node jarg1_);
  public final static native long Node_rpath_get(long jarg1, Node jarg1_);
  public final static native long Node_lpath_get(long jarg1, Node jarg1_);
  public final static native String Node_feature_get(long jarg1, Node jarg1_);
  public final static native long Node_id_get(long jarg1, Node jarg1_);
  public final static native int Node_length_get(long jarg1, Node jarg1_);
  public final static native int Node_rlength_get(long jarg1, Node jarg1_);
  public final static native int Node_rcAttr_get(long jarg1, Node jarg1_);
  public final static native int Node_lcAttr_get(long jarg1, Node jarg1_);
  public final static native int Node_posid_get(long jarg1, Node jarg1_);
  public final static native short Node_char_type_get(long jarg1, Node jarg1_);
  public final static native short Node_stat_get(long jarg1, Node jarg1_);
  public final static native short Node_isbest_get(long jarg1, Node jarg1_);
  public final static native float Node_alpha_get(long jarg1, Node jarg1_);
  public final static native float Node_beta_get(long jarg1, Node jarg1_);
  public final static native void Node_prob_set(long jarg1, Node jarg1_, float jarg2);
  public final static native float Node_prob_get(long jarg1, Node jarg1_);
  public final static native short Node_wcost_get(long jarg1, Node jarg1_);
  public final static native int Node_cost_get(long jarg1, Node jarg1_);
  public final static native long Node_token_get(long jarg1, Node jarg1_);
  public final static native String Node_surface_get(long jarg1, Node jarg1_);
  public final static native int MECAB_NOR_NODE_get();
  public final static native int MECAB_UNK_NODE_get();
  public final static native int MECAB_BOS_NODE_get();
  public final static native int MECAB_EOS_NODE_get();
  public final static native int MECAB_EON_NODE_get();
  public final static native int MECAB_USR_DIC_get();
  public final static native int MECAB_SYS_DIC_get();
  public final static native int MECAB_UNK_DIC_get();
  public final static native int MECAB_ONE_BEST_get();
  public final static native int MECAB_NBEST_get();
  public final static native int MECAB_PARTIAL_get();
  public final static native int MECAB_MARGINAL_PROB_get();
  public final static native int MECAB_ALTERNATIVE_get();
  public final static native int MECAB_ALL_MORPHS_get();
  public final static native int MECAB_ALLOCATE_SENTENCE_get();
  public final static native void Lattice_clear(long jarg1, Lattice jarg1_);
  public final static native boolean Lattice_is_available(long jarg1, Lattice jarg1_);
  public final static native long Lattice_bos_node(long jarg1, Lattice jarg1_);
  public final static native long Lattice_eos_node(long jarg1, Lattice jarg1_);
  public final static native long Lattice_end_nodes(long jarg1, Lattice jarg1_, long jarg2);
  public final static native long Lattice_begin_nodes(long jarg1, Lattice jarg1_, long jarg2);
  public final static native String Lattice_sentence(long jarg1, Lattice jarg1_);
  public final static native void Lattice_set_sentence__SWIG_0(long jarg1, Lattice jarg1_, String jarg2);
  public final static native void Lattice_set_sentence__SWIG_1(long jarg1, Lattice jarg1_, String jarg2, long jarg3);
  public final static native long Lattice_size(long jarg1, Lattice jarg1_);
  public final static native long Lattice_len(long jarg1, Lattice jarg1_);
  public final static native void Lattice_set_Z(long jarg1, Lattice jarg1_, double jarg2);
  public final static native double Lattice_Z(long jarg1, Lattice jarg1_);
  public final static native float Lattice_theta(long jarg1, Lattice jarg1_);
  public final static native void Lattice_set_theta(long jarg1, Lattice jarg1_, float jarg2);
  public final static native boolean Lattice_next(long jarg1, Lattice jarg1_);
  public final static native int Lattice_request_type(long jarg1, Lattice jarg1_);
  public final static native boolean Lattice_has_request_type(long jarg1, Lattice jarg1_, int jarg2);
  public final static native void Lattice_set_request_type(long jarg1, Lattice jarg1_, int jarg2);
  public final static native void Lattice_add_request_type(long jarg1, Lattice jarg1_, int jarg2);
  public final static native void Lattice_remove_request_type(long jarg1, Lattice jarg1_, int jarg2);
  public final static native String Lattice_toString__SWIG_0(long jarg1, Lattice jarg1_);
  public final static native String Lattice_toString__SWIG_1(long jarg1, Lattice jarg1_, long jarg2, Node jarg2_);
  public final static native String Lattice_enumNBestAsString(long jarg1, Lattice jarg1_, long jarg2);
  public final static native String Lattice_what(long jarg1, Lattice jarg1_);
  public final static native void Lattice_set_what(long jarg1, Lattice jarg1_, String jarg2);
  public final static native long Lattice_create();
  public final static native void delete_Lattice(long jarg1);
  public final static native long new_Lattice();
  public final static native boolean Model_open__SWIG_0(long jarg1, Model jarg1_, int jarg2, long jarg3);
  public final static native boolean Model_open__SWIG_1(long jarg1, Model jarg1_, String jarg2);
  public final static native boolean Model_is_available(long jarg1, Model jarg1_);
  public final static native long Model_dictionary_info(long jarg1, Model jarg1_);
  public final static native String Model_what(long jarg1, Model jarg1_);
  public final static native String Model_version();
  public final static native void delete_Model(long jarg1);
  public final static native long Model_create__SWIG_0(int jarg1, long jarg2);
  public final static native long Model_create__SWIG_1(String jarg1);
  public final static native long new_Model__SWIG_0(String jarg1);
  public final static native long new_Model__SWIG_1();
  public final static native long Model_createTagger(long jarg1, Model jarg1_);
  public final static native long Model_createLattice(long jarg1, Model jarg1_);
  public final static native boolean Tagger_parse__SWIG_0(long jarg1, Model jarg1_, long jarg2, Lattice jarg2_);
  public final static native boolean Tagger_parse__SWIG_1(long jarg1, Tagger jarg1_, long jarg2, Lattice jarg2_);
  public final static native boolean Tagger_parse__SWIG_2(long jarg1, Tagger jarg1_, String jarg2, long jarg3, Lattice jarg3_);
  public final static native boolean Tagger_parse__SWIG_3(long jarg1, Tagger jarg1_, String jarg2, long jarg3, long jarg4, Lattice jarg4_);
  public final static native String Tagger_parse__SWIG_4(long jarg1, Tagger jarg1_, String jarg2);
  public final static native long Tagger_parseToNode(long jarg1, Tagger jarg1_, String jarg2);
  public final static native String Tagger_parseNBest(long jarg1, Tagger jarg1_, long jarg2, String jarg3);
  public final static native boolean Tagger_parseNBestInit(long jarg1, Tagger jarg1_, String jarg2);
  public final static native long Tagger_nextNode(long jarg1, Tagger jarg1_);
  public final static native String Tagger_next(long jarg1, Tagger jarg1_);
  public final static native String Tagger_formatNode(long jarg1, Tagger jarg1_, long jarg2, Node jarg2_);
  public final static native void Tagger_set_request_type(long jarg1, Tagger jarg1_, int jarg2);
  public final static native int Tagger_request_type(long jarg1, Tagger jarg1_);
  public final static native boolean Tagger_partial(long jarg1, Tagger jarg1_);
  public final static native void Tagger_set_partial(long jarg1, Tagger jarg1_, boolean jarg2);
  public final static native int Tagger_lattice_level(long jarg1, Tagger jarg1_);
  public final static native void Tagger_set_lattice_level(long jarg1, Tagger jarg1_, int jarg2);
  public final static native boolean Tagger_all_morphs(long jarg1, Tagger jarg1_);
  public final static native void Tagger_set_all_morphs(long jarg1, Tagger jarg1_, boolean jarg2);
  public final static native float Tagger_theta(long jarg1, Tagger jarg1_);
  public final static native void Tagger_set_theta(long jarg1, Tagger jarg1_, float jarg2);
  public final static native long Tagger_dictionary_info(long jarg1, Tagger jarg1_);
  public final static native String Tagger_what(long jarg1, Tagger jarg1_);
  public final static native void delete_Tagger(long jarg1);
  public final static native long Tagger_create__SWIG_0(int jarg1, long jarg2);
  public final static native long Tagger_create__SWIG_1(String jarg1);
  public final static native String Tagger_version();
  public final static native long new_Tagger__SWIG_0(String jarg1);
  public final static native long new_Tagger__SWIG_1();
  public final static native String Tagger_parseToString__SWIG_0(long jarg1, Tagger jarg1_, String jarg2, long jarg3);
  public final static native String Tagger_parseToString__SWIG_1(long jarg1, Tagger jarg1_, String jarg2);
  public final static native String VERSION_get();
}
