package controllers;

import apimodels.CollectionInfo;
import apimodels.CompoundInfo;
import apimodels.CompoundList;
import apimodels.ErrorMsg;
import java.util.List;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;

public class CompoundsApiControllerImp implements CompoundsApiControllerImpInterface {
    @Override
    public CompoundInfo compoundByIdCompoundIdGet(String compoundId, String cache) throws Exception {
        //Do your magic!!!
        return new CompoundInfo();
    }

    @Override
    public CollectionInfo compoundByIdPost(List<String> requestBody, String cache) throws Exception {
        //Do your magic!!!
        return new CollectionInfo();
    }

    @Override
    public CompoundList compoundByNameNameGet(String name, String cache) throws Exception {
        //Do your magic!!!
        return new CompoundList();
    }

    @Override
    public CollectionInfo compoundByNamePost(List<String> requestBody, String cache) throws Exception {
        //Do your magic!!!
        return new CollectionInfo();
    }

    @Override
    public CompoundInfo compoundByStructurePost(String body, String cache) throws Exception {
        //Do your magic!!!
        return new CompoundInfo();
    }

}
