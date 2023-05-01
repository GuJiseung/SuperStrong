.class public final Lcom/bumptech/glide/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/b$a;
    }
.end annotation


# static fields
.field public static volatile j:Lcom/bumptech/glide/b;

.field public static volatile k:Z


# instance fields
.field public final b:Ll1/d;

.field public final c:Lm1/h;

.field public final d:Lcom/bumptech/glide/g;

.field public final e:Lcom/bumptech/glide/j;

.field public final f:Ll1/b;

.field public final g:Lx1/l;

.field public final h:Lx1/c;

.field public final i:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lk1/m;Lm1/h;Ll1/d;Ll1/b;Lx1/l;Lx1/c;ILcom/bumptech/glide/c;Ll/b;Ljava/util/List;Lcom/bumptech/glide/h;)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p4

    move-object/from16 v4, p5

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    iput-object v2, v1, Lcom/bumptech/glide/b;->b:Ll1/d;

    iput-object v4, v1, Lcom/bumptech/glide/b;->f:Ll1/b;

    move-object/from16 v3, p3

    iput-object v3, v1, Lcom/bumptech/glide/b;->c:Lm1/h;

    move-object/from16 v3, p6

    iput-object v3, v1, Lcom/bumptech/glide/b;->g:Lx1/l;

    move-object/from16 v3, p7

    iput-object v3, v1, Lcom/bumptech/glide/b;->h:Lx1/c;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    new-instance v5, Lcom/bumptech/glide/j;

    invoke-direct {v5}, Lcom/bumptech/glide/j;-><init>()V

    iput-object v5, v1, Lcom/bumptech/glide/b;->e:Lcom/bumptech/glide/j;

    new-instance v6, Lr1/k;

    invoke-direct {v6}, Lr1/k;-><init>()V

    .line 1
    iget-object v7, v5, Lcom/bumptech/glide/j;->g:Lu0/c;

    .line 2
    monitor-enter v7

    .line 3
    :try_start_0
    iget-object v8, v7, Lu0/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    monitor-exit v7

    .line 4
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1b

    if-lt v6, v7, :cond_0

    new-instance v7, Lr1/p;

    invoke-direct {v7}, Lr1/p;-><init>()V

    .line 5
    iget-object v8, v5, Lcom/bumptech/glide/j;->g:Lu0/c;

    .line 6
    monitor-enter v8

    .line 7
    :try_start_1
    iget-object v9, v8, Lu0/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v8

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v8

    throw v0

    .line 8
    :cond_0
    :goto_0
    invoke-virtual {v5}, Lcom/bumptech/glide/j;->d()Ljava/util/ArrayList;

    move-result-object v7

    new-instance v8, Lv1/a;

    invoke-direct {v8, v0, v7, v2, v4}, Lv1/a;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Ll1/d;Ll1/b;)V

    .line 9
    new-instance v9, Lr1/c0;

    new-instance v10, Lr1/c0$g;

    invoke-direct {v10}, Lr1/c0$g;-><init>()V

    invoke-direct {v9, v2, v10}, Lr1/c0;-><init>(Ll1/d;Lr1/c0$f;)V

    .line 10
    new-instance v10, Lr1/m;

    invoke-virtual {v5}, Lcom/bumptech/glide/j;->d()Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v12

    invoke-direct {v10, v11, v12, v2, v4}, Lr1/m;-><init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;Ll1/d;Ll1/b;)V

    const-class v11, Lcom/bumptech/glide/d;

    move-object/from16 v12, p12

    .line 11
    iget-object v13, v12, Lcom/bumptech/glide/h;->a:Ljava/util/Map;

    invoke-interface {v13, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    const/4 v13, 0x0

    if-eqz v11, :cond_1

    const/16 v11, 0x1c

    if-lt v6, v11, :cond_1

    .line 12
    new-instance v11, Lr1/t;

    invoke-direct {v11}, Lr1/t;-><init>()V

    new-instance v14, Lr1/h;

    invoke-direct {v14}, Lr1/h;-><init>()V

    goto :goto_1

    :cond_1
    new-instance v14, Lr1/g;

    invoke-direct {v14, v13, v10}, Lr1/g;-><init>(ILjava/lang/Object;)V

    new-instance v11, Lr1/y;

    invoke-direct {v11, v10, v4}, Lr1/y;-><init>(Lr1/m;Ll1/b;)V

    :goto_1
    new-instance v15, Lt1/d;

    invoke-direct {v15, v0}, Lt1/d;-><init>(Landroid/content/Context;)V

    new-instance v13, Lo1/s$c;

    invoke-direct {v13, v3}, Lo1/s$c;-><init>(Landroid/content/res/Resources;)V

    new-instance v12, Lo1/s$d;

    invoke-direct {v12, v3}, Lo1/s$d;-><init>(Landroid/content/res/Resources;)V

    new-instance v1, Lo1/s$b;

    invoke-direct {v1, v3}, Lo1/s$b;-><init>(Landroid/content/res/Resources;)V

    move/from16 p6, v6

    new-instance v6, Lo1/s$a;

    invoke-direct {v6, v3}, Lo1/s$a;-><init>(Landroid/content/res/Resources;)V

    new-instance v0, Lr1/c;

    invoke-direct {v0, v4}, Lr1/c;-><init>(Ll1/b;)V

    move-object/from16 p7, v6

    new-instance v6, Lw1/a;

    invoke-direct {v6}, Lw1/a;-><init>()V

    move-object/from16 v16, v6

    new-instance v6, Landroidx/activity/k;

    move-object/from16 v17, v12

    const/4 v12, 0x1

    invoke-direct {v6, v12}, Landroidx/activity/k;-><init>(I)V

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v12

    move-object/from16 v19, v6

    new-instance v6, Landroidx/activity/k;

    move-object/from16 v20, v12

    const/4 v12, 0x0

    invoke-direct {v6, v12}, Landroidx/activity/k;-><init>(I)V

    const-class v12, Ljava/nio/ByteBuffer;

    move-object/from16 v21, v1

    .line 13
    iget-object v1, v5, Lcom/bumptech/glide/j;->b:Lz1/a;

    .line 14
    monitor-enter v1

    move-object/from16 v22, v13

    .line 15
    :try_start_2
    iget-object v13, v1, Lz1/a;->a:Ljava/util/ArrayList;

    move-object/from16 v23, v15

    new-instance v15, Lz1/a$a;

    invoke-direct {v15, v12, v6}, Lz1/a$a;-><init>(Ljava/lang/Class;Li1/d;)V

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit v1

    .line 16
    new-instance v1, La1/r;

    const/4 v6, 0x2

    invoke-direct {v1, v6, v4}, La1/r;-><init>(ILjava/lang/Object;)V

    const-class v6, Ljava/io/InputStream;

    .line 17
    iget-object v13, v5, Lcom/bumptech/glide/j;->b:Lz1/a;

    .line 18
    monitor-enter v13

    .line 19
    :try_start_3
    iget-object v15, v13, Lz1/a;->a:Ljava/util/ArrayList;

    new-instance v4, Lz1/a$a;

    invoke-direct {v4, v6, v1}, Lz1/a$a;-><init>(Ljava/lang/Class;Li1/d;)V

    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v13

    .line 20
    const-class v1, Landroid/graphics/Bitmap;

    const-string v4, "Bitmap"

    invoke-virtual {v5, v14, v12, v1, v4}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    invoke-virtual {v5, v11, v6, v1, v4}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    new-instance v13, Lr1/v;

    invoke-direct {v13, v10}, Lr1/v;-><init>(Lr1/m;)V

    const-class v10, Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v5, v13, v10, v1, v4}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    invoke-virtual {v5, v9, v10, v1, v4}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 21
    new-instance v13, Lr1/c0;

    new-instance v15, Lr1/c0$c;

    invoke-direct {v15}, Lr1/c0$c;-><init>()V

    invoke-direct {v13, v2, v15}, Lr1/c0;-><init>(Ll1/d;Lr1/c0$f;)V

    .line 22
    const-class v15, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v5, v13, v15, v1, v4}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    sget-object v13, Lo1/u$a;->a:Lo1/u$a;

    invoke-virtual {v5, v1, v1, v13}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    move-object/from16 v24, v15

    new-instance v15, Lr1/a0;

    invoke-direct {v15}, Lr1/a0;-><init>()V

    invoke-virtual {v5, v15, v1, v1, v4}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    invoke-virtual {v5, v1, v0}, Lcom/bumptech/glide/j;->b(Ljava/lang/Class;Li1/k;)V

    new-instance v15, Lr1/a;

    invoke-direct {v15, v3, v14}, Lr1/a;-><init>(Landroid/content/res/Resources;Li1/j;)V

    const-class v14, Landroid/graphics/drawable/BitmapDrawable;

    move-object/from16 v25, v1

    const-string v1, "BitmapDrawable"

    invoke-virtual {v5, v15, v12, v14, v1}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    new-instance v15, Lr1/a;

    invoke-direct {v15, v3, v11}, Lr1/a;-><init>(Landroid/content/res/Resources;Li1/j;)V

    invoke-virtual {v5, v15, v6, v14, v1}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    new-instance v11, Lr1/a;

    invoke-direct {v11, v3, v9}, Lr1/a;-><init>(Landroid/content/res/Resources;Li1/j;)V

    invoke-virtual {v5, v11, v10, v14, v1}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    new-instance v1, Lr1/b;

    invoke-direct {v1, v2, v0}, Lr1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v14, v1}, Lcom/bumptech/glide/j;->b(Ljava/lang/Class;Li1/k;)V

    new-instance v0, Lv1/h;

    move-object/from16 v1, p5

    invoke-direct {v0, v7, v8, v1}, Lv1/h;-><init>(Ljava/util/ArrayList;Lv1/a;Ll1/b;)V

    const-class v7, Lv1/c;

    const-string v9, "Gif"

    invoke-virtual {v5, v0, v6, v7, v9}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    invoke-virtual {v5, v8, v12, v7, v9}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    new-instance v0, Ls4/y;

    invoke-direct {v0}, Ls4/y;-><init>()V

    invoke-virtual {v5, v7, v0}, Lcom/bumptech/glide/j;->b(Ljava/lang/Class;Li1/k;)V

    const-class v0, Lh1/a;

    invoke-virtual {v5, v0, v0, v13}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v8, Lr1/g;

    const/4 v9, 0x1

    invoke-direct {v8, v9, v2}, Lr1/g;-><init>(ILjava/lang/Object;)V

    move-object/from16 v9, v25

    invoke-virtual {v5, v8, v0, v9, v4}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 23
    const-class v0, Landroid/net/Uri;

    const-class v4, Landroid/graphics/drawable/Drawable;

    const-string v8, "legacy_append"

    move-object/from16 v11, v23

    invoke-virtual {v5, v11, v0, v4, v8}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 24
    new-instance v15, Lr1/x;

    invoke-direct {v15, v11, v2}, Lr1/x;-><init>(Lt1/d;Ll1/d;)V

    .line 25
    invoke-virtual {v5, v15, v0, v9, v8}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 26
    new-instance v11, Ls1/a$a;

    invoke-direct {v11}, Ls1/a$a;-><init>()V

    invoke-virtual {v5, v11}, Lcom/bumptech/glide/j;->f(Lcom/bumptech/glide/load/data/e$a;)V

    new-instance v11, Lo1/c$b;

    invoke-direct {v11}, Lo1/c$b;-><init>()V

    const-class v15, Ljava/io/File;

    invoke-virtual {v5, v15, v12, v11}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v11, Lo1/e$e;

    invoke-direct {v11}, Lo1/e$e;-><init>()V

    invoke-virtual {v5, v15, v6, v11}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v11, Lu1/a;

    invoke-direct {v11}, Lu1/a;-><init>()V

    .line 27
    invoke-virtual {v5, v11, v15, v15, v8}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 28
    new-instance v11, Lo1/e$b;

    invoke-direct {v11}, Lo1/e$b;-><init>()V

    invoke-virtual {v5, v15, v10, v11}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    invoke-virtual {v5, v15, v15, v13}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v11, Lcom/bumptech/glide/load/data/j$a;

    invoke-direct {v11, v1}, Lcom/bumptech/glide/load/data/j$a;-><init>(Ll1/b;)V

    invoke-virtual {v5, v11}, Lcom/bumptech/glide/j;->f(Lcom/bumptech/glide/load/data/e$a;)V

    new-instance v11, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;

    invoke-direct {v11}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;-><init>()V

    invoke-virtual {v5, v11}, Lcom/bumptech/glide/j;->f(Lcom/bumptech/glide/load/data/e$a;)V

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v1, v22

    invoke-virtual {v5, v11, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    move-object/from16 v18, v7

    move-object/from16 v7, v21

    invoke-virtual {v5, v11, v10, v7}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    const-class v2, Ljava/lang/Integer;

    invoke-virtual {v5, v2, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    invoke-virtual {v5, v2, v10, v7}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    move-object/from16 v1, v17

    invoke-virtual {v5, v2, v0, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    move-object/from16 v7, p7

    move-object/from16 v9, v24

    invoke-virtual {v5, v11, v9, v7}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    invoke-virtual {v5, v2, v9, v7}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    invoke-virtual {v5, v11, v0, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/d$c;

    invoke-direct {v1}, Lo1/d$c;-><init>()V

    const-class v2, Ljava/lang/String;

    invoke-virtual {v5, v2, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/d$c;

    invoke-direct {v1}, Lo1/d$c;-><init>()V

    invoke-virtual {v5, v0, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/t$c;

    invoke-direct {v1}, Lo1/t$c;-><init>()V

    invoke-virtual {v5, v2, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/t$b;

    invoke-direct {v1}, Lo1/t$b;-><init>()V

    invoke-virtual {v5, v2, v10, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/t$a;

    invoke-direct {v1}, Lo1/t$a;-><init>()V

    invoke-virtual {v5, v2, v9, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/a$c;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-direct {v1, v2}, Lo1/a$c;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v5, v0, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/a$b;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-direct {v1, v2}, Lo1/a$b;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v5, v0, v10, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lp1/b$a;

    move-object/from16 v7, p1

    invoke-direct {v1, v7}, Lp1/b$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v0, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lp1/c$a;

    invoke-direct {v1, v7}, Lp1/c$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v0, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    const/16 v1, 0x1d

    move/from16 v2, p6

    if-lt v2, v1, :cond_2

    new-instance v1, Lp1/d$c;

    invoke-direct {v1, v7}, Lp1/d$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v0, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lp1/d$b;

    invoke-direct {v1, v7}, Lp1/d$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v0, v10, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    :cond_2
    new-instance v1, Lo1/v$d;

    move-object/from16 v2, v20

    invoke-direct {v1, v2}, Lo1/v$d;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v5, v0, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/v$b;

    invoke-direct {v1, v2}, Lo1/v$b;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v5, v0, v10, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/v$a;

    invoke-direct {v1, v2}, Lo1/v$a;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v5, v0, v9, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/w$a;

    invoke-direct {v1}, Lo1/w$a;-><init>()V

    invoke-virtual {v5, v0, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lp1/e$a;

    invoke-direct {v1}, Lp1/e$a;-><init>()V

    const-class v2, Ljava/net/URL;

    invoke-virtual {v5, v2, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/j$a;

    invoke-direct {v1, v7}, Lo1/j$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v0, v15, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lp1/a$a;

    invoke-direct {v1}, Lp1/a$a;-><init>()V

    const-class v2, Lo1/f;

    invoke-virtual {v5, v2, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/b$a;

    invoke-direct {v1}, Lo1/b$a;-><init>()V

    const-class v2, [B

    invoke-virtual {v5, v2, v12, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v1, Lo1/b$d;

    invoke-direct {v1}, Lo1/b$d;-><init>()V

    invoke-virtual {v5, v2, v6, v1}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    invoke-virtual {v5, v0, v0, v13}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    invoke-virtual {v5, v4, v4, v13}, Lcom/bumptech/glide/j;->c(Ljava/lang/Class;Ljava/lang/Class;Lo1/o;)V

    new-instance v0, Lt1/e;

    invoke-direct {v0}, Lt1/e;-><init>()V

    .line 29
    invoke-virtual {v5, v0, v4, v4, v8}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 30
    new-instance v0, La1/r;

    invoke-direct {v0, v3}, La1/r;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 v1, v25

    invoke-virtual {v5, v1, v14, v0}, Lcom/bumptech/glide/j;->g(Ljava/lang/Class;Ljava/lang/Class;Lw1/b;)V

    move-object/from16 v0, v16

    invoke-virtual {v5, v1, v2, v0}, Lcom/bumptech/glide/j;->g(Ljava/lang/Class;Ljava/lang/Class;Lw1/b;)V

    new-instance v6, Lf1/c;

    move-object/from16 v8, p4

    move-object/from16 v9, v19

    invoke-direct {v6, v8, v0, v9}, Lf1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v4, v2, v6}, Lcom/bumptech/glide/j;->g(Ljava/lang/Class;Ljava/lang/Class;Lw1/b;)V

    move-object/from16 v0, v18

    invoke-virtual {v5, v0, v2, v9}, Lcom/bumptech/glide/j;->g(Ljava/lang/Class;Ljava/lang/Class;Lw1/b;)V

    .line 31
    new-instance v0, Lr1/c0;

    new-instance v2, Lr1/c0$d;

    invoke-direct {v2}, Lr1/c0$d;-><init>()V

    invoke-direct {v0, v8, v2}, Lr1/c0;-><init>(Ll1/d;Lr1/c0$f;)V

    .line 32
    const-class v2, Ljava/nio/ByteBuffer;

    const-string v4, "legacy_append"

    invoke-virtual {v5, v0, v2, v1, v4}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 33
    new-instance v1, Lr1/a;

    invoke-direct {v1, v3, v0}, Lr1/a;-><init>(Landroid/content/res/Resources;Li1/j;)V

    .line 34
    const-class v0, Ljava/nio/ByteBuffer;

    const-string v2, "legacy_append"

    invoke-virtual {v5, v1, v0, v14, v2}, Lcom/bumptech/glide/j;->a(Li1/j;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 35
    new-instance v6, La1/f0;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, La1/f0;-><init>(I)V

    new-instance v0, Lcom/bumptech/glide/g;

    move-object v2, v0

    move-object/from16 v3, p1

    move-object/from16 v4, p5

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p2

    move-object/from16 v11, p12

    move/from16 v12, p8

    invoke-direct/range {v2 .. v12}, Lcom/bumptech/glide/g;-><init>(Landroid/content/Context;Ll1/b;Lcom/bumptech/glide/j;La1/f0;Lcom/bumptech/glide/c;Ll/b;Ljava/util/List;Lk1/m;Lcom/bumptech/glide/h;I)V

    move-object/from16 v2, p0

    iput-object v0, v2, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/g;

    return-void

    :catchall_1
    move-exception v0

    move-object/from16 v2, p0

    .line 36
    monitor-exit v13

    throw v0

    :catchall_2
    move-exception v0

    move-object/from16 v2, p0

    monitor-exit v1

    throw v0

    :catchall_3
    move-exception v0

    move-object v2, v1

    .line 37
    monitor-exit v7

    throw v0
.end method

.method public static a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 32

    .line 1
    sget-boolean v0, Lcom/bumptech/glide/b;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_13

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput-boolean v0, Lcom/bumptech/glide/b;->k:Z

    .line 7
    .line 8
    new-instance v11, Ll/b;

    .line 9
    .line 10
    invoke-direct {v11}, Ll/b;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lcom/bumptech/glide/h$a;

    .line 14
    .line 15
    invoke-direct {v1}, Lcom/bumptech/glide/h$a;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v10, Lcom/bumptech/glide/c;

    .line 19
    .line 20
    invoke-direct {v10}, Lcom/bumptech/glide/c;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v14

    .line 27
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    const-string v2, "Got app info metadata: "

    .line 31
    .line 32
    const-string v3, "ManifestParser"

    .line 33
    .line 34
    const/4 v4, 0x3

    .line 35
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    const-string v5, "Loading Glide modules"

    .line 42
    .line 43
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    :cond_0
    new-instance v15, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    :try_start_0
    invoke-virtual {v14}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v14}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const/16 v7, 0x80

    .line 60
    .line 61
    invoke-virtual {v5, v6, v7}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-object v6, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 66
    .line 67
    const/4 v7, 0x2

    .line 68
    if-nez v6, :cond_1

    .line 69
    .line 70
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_5

    .line 75
    .line 76
    const-string v2, "Got null app info metadata"

    .line 77
    .line 78
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-static {v3, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-eqz v6, :cond_2

    .line 87
    .line 88
    new-instance v6, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 94
    .line 95
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    :cond_2
    iget-object v2, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 106
    .line 107
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :cond_3
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_4

    .line 120
    .line 121
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, Ljava/lang/String;

    .line 126
    .line 127
    const-string v8, "GlideModule"

    .line 128
    .line 129
    iget-object v12, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 130
    .line 131
    invoke-virtual {v12, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-eqz v8, :cond_3

    .line 140
    .line 141
    invoke-static {v6}, Ly1/e;->a(Ljava/lang/String;)Ly1/c;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    if-eqz v8, :cond_3

    .line 153
    .line 154
    new-instance v8, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const-string v12, "Loaded Glide module: "

    .line 160
    .line 161
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_4
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_5

    .line 180
    .line 181
    const-string v2, "Finished loading Glide modules"

    .line 182
    .line 183
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    :cond_5
    :goto_1
    const-string v2, "Glide"

    .line 187
    .line 188
    if-eqz p1, :cond_8

    .line 189
    .line 190
    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/GeneratedAppGlideModule;->c()Ljava/util/Set;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-nez v3, :cond_8

    .line 199
    .line 200
    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/GeneratedAppGlideModule;->c()Ljava/util/Set;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-eqz v6, :cond_8

    .line 213
    .line 214
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    check-cast v6, Ly1/c;

    .line 219
    .line 220
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    invoke-interface {v3, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    if-nez v8, :cond_6

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_6
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    if-eqz v8, :cond_7

    .line 236
    .line 237
    new-instance v8, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-string v12, "AppGlideModule excludes manifest GlideModule: "

    .line 240
    .line 241
    invoke-direct {v8, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-static {v2, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_8
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    if-eqz v3, :cond_9

    .line 263
    .line 264
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    if-eqz v4, :cond_9

    .line 273
    .line 274
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    check-cast v4, Ly1/c;

    .line 279
    .line 280
    new-instance v5, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v6, "Discovered GlideModule from manifest: "

    .line 283
    .line 284
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 299
    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_9
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-eqz v3, :cond_a

    .line 311
    .line 312
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    check-cast v3, Ly1/c;

    .line 317
    .line 318
    invoke-interface {v3}, Ly1/b;->a()V

    .line 319
    .line 320
    .line 321
    goto :goto_4

    .line 322
    :cond_a
    sget v2, Ln1/a;->d:I

    .line 323
    .line 324
    const/4 v3, 0x4

    .line 325
    if-nez v2, :cond_b

    .line 326
    .line 327
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    sput v2, Ln1/a;->d:I

    .line 340
    .line 341
    :cond_b
    sget v18, Ln1/a;->d:I

    .line 342
    .line 343
    const-string v2, "source"

    .line 344
    .line 345
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 346
    .line 347
    .line 348
    move-result v4

    .line 349
    if-nez v4, :cond_12

    .line 350
    .line 351
    new-instance v4, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 352
    .line 353
    const-wide/16 v19, 0x0

    .line 354
    .line 355
    sget-object v21, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 356
    .line 357
    new-instance v22, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 358
    .line 359
    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 360
    .line 361
    .line 362
    new-instance v5, Ln1/a$a;

    .line 363
    .line 364
    const/4 v13, 0x0

    .line 365
    invoke-direct {v5, v2, v13}, Ln1/a$a;-><init>(Ljava/lang/String;Z)V

    .line 366
    .line 367
    .line 368
    move-object/from16 v16, v4

    .line 369
    .line 370
    move/from16 v17, v18

    .line 371
    .line 372
    move-object/from16 v23, v5

    .line 373
    .line 374
    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 375
    .line 376
    .line 377
    new-instance v2, Ln1/a;

    .line 378
    .line 379
    invoke-direct {v2, v4}, Ln1/a;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 380
    .line 381
    .line 382
    sget v4, Ln1/a;->d:I

    .line 383
    .line 384
    const-string v4, "disk-cache"

    .line 385
    .line 386
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 387
    .line 388
    .line 389
    move-result v5

    .line 390
    if-nez v5, :cond_11

    .line 391
    .line 392
    new-instance v5, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 393
    .line 394
    const-wide/16 v19, 0x0

    .line 395
    .line 396
    sget-object v21, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 397
    .line 398
    new-instance v22, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 399
    .line 400
    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 401
    .line 402
    .line 403
    new-instance v6, Ln1/a$a;

    .line 404
    .line 405
    invoke-direct {v6, v4, v0}, Ln1/a$a;-><init>(Ljava/lang/String;Z)V

    .line 406
    .line 407
    .line 408
    const/16 v18, 0x1

    .line 409
    .line 410
    move-object/from16 v16, v5

    .line 411
    .line 412
    move/from16 v17, v18

    .line 413
    .line 414
    move-object/from16 v23, v6

    .line 415
    .line 416
    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 417
    .line 418
    .line 419
    new-instance v4, Ln1/a;

    .line 420
    .line 421
    invoke-direct {v4, v5}, Ln1/a;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 422
    .line 423
    .line 424
    sget v5, Ln1/a;->d:I

    .line 425
    .line 426
    if-nez v5, :cond_c

    .line 427
    .line 428
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    invoke-virtual {v5}, Ljava/lang/Runtime;->availableProcessors()I

    .line 433
    .line 434
    .line 435
    move-result v5

    .line 436
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 437
    .line 438
    .line 439
    move-result v5

    .line 440
    sput v5, Ln1/a;->d:I

    .line 441
    .line 442
    :cond_c
    sget v5, Ln1/a;->d:I

    .line 443
    .line 444
    if-lt v5, v3, :cond_d

    .line 445
    .line 446
    move/from16 v18, v7

    .line 447
    .line 448
    goto :goto_5

    .line 449
    :cond_d
    move/from16 v18, v0

    .line 450
    .line 451
    :goto_5
    const-string v3, "animation"

    .line 452
    .line 453
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 454
    .line 455
    .line 456
    move-result v5

    .line 457
    if-nez v5, :cond_10

    .line 458
    .line 459
    new-instance v5, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 460
    .line 461
    const-wide/16 v19, 0x0

    .line 462
    .line 463
    sget-object v21, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 464
    .line 465
    new-instance v22, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 466
    .line 467
    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 468
    .line 469
    .line 470
    new-instance v6, Ln1/a$a;

    .line 471
    .line 472
    invoke-direct {v6, v3, v0}, Ln1/a$a;-><init>(Ljava/lang/String;Z)V

    .line 473
    .line 474
    .line 475
    move-object/from16 v16, v5

    .line 476
    .line 477
    move/from16 v17, v18

    .line 478
    .line 479
    move-object/from16 v23, v6

    .line 480
    .line 481
    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 482
    .line 483
    .line 484
    new-instance v0, Ln1/a;

    .line 485
    .line 486
    invoke-direct {v0, v5}, Ln1/a;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 487
    .line 488
    .line 489
    new-instance v3, Lm1/i$a;

    .line 490
    .line 491
    invoke-direct {v3, v14}, Lm1/i$a;-><init>(Landroid/content/Context;)V

    .line 492
    .line 493
    .line 494
    new-instance v5, Lm1/i;

    .line 495
    .line 496
    invoke-direct {v5, v3}, Lm1/i;-><init>(Lm1/i$a;)V

    .line 497
    .line 498
    .line 499
    new-instance v8, Lx1/e;

    .line 500
    .line 501
    invoke-direct {v8}, Lx1/e;-><init>()V

    .line 502
    .line 503
    .line 504
    iget v3, v5, Lm1/i;->a:I

    .line 505
    .line 506
    if-lez v3, :cond_e

    .line 507
    .line 508
    new-instance v6, Ll1/j;

    .line 509
    .line 510
    move-object/from16 v16, v10

    .line 511
    .line 512
    int-to-long v9, v3

    .line 513
    invoke-direct {v6, v9, v10}, Ll1/j;-><init>(J)V

    .line 514
    .line 515
    .line 516
    goto :goto_6

    .line 517
    :cond_e
    move-object/from16 v16, v10

    .line 518
    .line 519
    new-instance v3, Ll1/e;

    .line 520
    .line 521
    invoke-direct {v3}, Ll1/e;-><init>()V

    .line 522
    .line 523
    .line 524
    move-object v6, v3

    .line 525
    :goto_6
    new-instance v7, Ll1/i;

    .line 526
    .line 527
    iget v3, v5, Lm1/i;->c:I

    .line 528
    .line 529
    invoke-direct {v7, v3}, Ll1/i;-><init>(I)V

    .line 530
    .line 531
    .line 532
    new-instance v9, Lm1/g;

    .line 533
    .line 534
    iget v3, v5, Lm1/i;->b:I

    .line 535
    .line 536
    int-to-long v12, v3

    .line 537
    invoke-direct {v9, v12, v13}, Lm1/g;-><init>(J)V

    .line 538
    .line 539
    .line 540
    new-instance v3, Lm1/f;

    .line 541
    .line 542
    invoke-direct {v3, v14}, Lm1/f;-><init>(Landroid/content/Context;)V

    .line 543
    .line 544
    .line 545
    new-instance v5, Lk1/m;

    .line 546
    .line 547
    new-instance v10, Ln1/a;

    .line 548
    .line 549
    new-instance v12, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 550
    .line 551
    const/16 v18, 0x0

    .line 552
    .line 553
    sget-wide v20, Ln1/a;->c:J

    .line 554
    .line 555
    sget-object v22, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 556
    .line 557
    new-instance v23, Ljava/util/concurrent/SynchronousQueue;

    .line 558
    .line 559
    invoke-direct/range {v23 .. v23}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 560
    .line 561
    .line 562
    new-instance v13, Ln1/a$a;

    .line 563
    .line 564
    move-object/from16 v30, v15

    .line 565
    .line 566
    const-string v15, "source-unlimited"

    .line 567
    .line 568
    move-object/from16 v31, v11

    .line 569
    .line 570
    const/4 v11, 0x0

    .line 571
    invoke-direct {v13, v15, v11}, Ln1/a$a;-><init>(Ljava/lang/String;Z)V

    .line 572
    .line 573
    .line 574
    const v19, 0x7fffffff

    .line 575
    .line 576
    .line 577
    move-object/from16 v17, v12

    .line 578
    .line 579
    move-object/from16 v24, v13

    .line 580
    .line 581
    invoke-direct/range {v17 .. v24}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 582
    .line 583
    .line 584
    invoke-direct {v10, v12}, Ln1/a;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 585
    .line 586
    .line 587
    move-object/from16 v23, v5

    .line 588
    .line 589
    move-object/from16 v24, v9

    .line 590
    .line 591
    move-object/from16 v25, v3

    .line 592
    .line 593
    move-object/from16 v26, v4

    .line 594
    .line 595
    move-object/from16 v27, v2

    .line 596
    .line 597
    move-object/from16 v28, v10

    .line 598
    .line 599
    move-object/from16 v29, v0

    .line 600
    .line 601
    invoke-direct/range {v23 .. v29}, Lk1/m;-><init>(Lm1/h;Lm1/a$a;Ln1/a;Ln1/a;Ln1/a;Ln1/a;)V

    .line 602
    .line 603
    .line 604
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 605
    .line 606
    .line 607
    move-result-object v12

    .line 608
    new-instance v13, Lcom/bumptech/glide/h;

    .line 609
    .line 610
    invoke-direct {v13, v1}, Lcom/bumptech/glide/h;-><init>(Lcom/bumptech/glide/h$a;)V

    .line 611
    .line 612
    .line 613
    new-instance v0, Lx1/l;

    .line 614
    .line 615
    const/4 v1, 0x0

    .line 616
    invoke-direct {v0, v1, v13}, Lx1/l;-><init>(Lx1/l$b;Lcom/bumptech/glide/h;)V

    .line 617
    .line 618
    .line 619
    new-instance v15, Lcom/bumptech/glide/b;

    .line 620
    .line 621
    move-object v1, v15

    .line 622
    move-object v2, v14

    .line 623
    move-object v3, v5

    .line 624
    move-object v4, v9

    .line 625
    move-object v5, v6

    .line 626
    move-object v6, v7

    .line 627
    move-object v7, v0

    .line 628
    const/4 v0, 0x4

    .line 629
    move v9, v0

    .line 630
    move-object/from16 v10, v16

    .line 631
    .line 632
    move v0, v11

    .line 633
    move-object/from16 v11, v31

    .line 634
    .line 635
    invoke-direct/range {v1 .. v13}, Lcom/bumptech/glide/b;-><init>(Landroid/content/Context;Lk1/m;Lm1/h;Ll1/d;Ll1/b;Lx1/l;Lx1/c;ILcom/bumptech/glide/c;Ll/b;Ljava/util/List;Lcom/bumptech/glide/h;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v30 .. v30}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    if-eqz v2, :cond_f

    .line 647
    .line 648
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    check-cast v2, Ly1/c;

    .line 653
    .line 654
    :try_start_1
    invoke-interface {v2}, Ly1/f;->b()V
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0

    .line 655
    .line 656
    .line 657
    goto :goto_7

    .line 658
    :catch_0
    move-exception v0

    .line 659
    move-object v1, v0

    .line 660
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 661
    .line 662
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    const-string v3, "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you\'re using Glide v4. You\'ll need to find and remove (or update) the offending dependency. The v3 module name is: "

    .line 671
    .line 672
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    invoke-direct {v0, v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 677
    .line 678
    .line 679
    throw v0

    .line 680
    :cond_f
    invoke-virtual {v14, v15}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 681
    .line 682
    .line 683
    sput-object v15, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    .line 684
    .line 685
    sput-boolean v0, Lcom/bumptech/glide/b;->k:Z

    .line 686
    .line 687
    return-void

    .line 688
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 689
    .line 690
    const-string v1, "Name must be non-null and non-empty, but given: animation"

    .line 691
    .line 692
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    throw v0

    .line 696
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 697
    .line 698
    const-string v1, "Name must be non-null and non-empty, but given: disk-cache"

    .line 699
    .line 700
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    throw v0

    .line 704
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 705
    .line 706
    const-string v1, "Name must be non-null and non-empty, but given: source"

    .line 707
    .line 708
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    throw v0

    .line 712
    :catch_1
    move-exception v0

    .line 713
    new-instance v1, Ljava/lang/RuntimeException;

    .line 714
    .line 715
    const-string v2, "Unable to find metadata to parse GlideModules"

    .line 716
    .line 717
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 718
    .line 719
    .line 720
    throw v1

    .line 721
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 722
    .line 723
    const-string v1, "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"

    .line 724
    .line 725
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    throw v0
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
.end method

.method public static b(Landroid/content/Context;)Lcom/bumptech/glide/b;
    .locals 6

    .line 1
    sget-object v0, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    const-string v1, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x1

    .line 16
    new-array v3, v2, [Ljava/lang/Class;

    .line 17
    .line 18
    const-class v4, Landroid/content/Context;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    aput-object v4, v3, v5

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-array v2, v2, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    aput-object v0, v2, v5

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 46
    .line 47
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :catch_1
    move-exception p0

    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 55
    .line 56
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :catch_2
    move-exception p0

    .line 61
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 64
    .line 65
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :catch_3
    move-exception p0

    .line 70
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 73
    .line 74
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :catch_4
    const-string v0, "Glide"

    .line 79
    .line 80
    const/4 v1, 0x5

    .line 81
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    const-string v1, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 88
    .line 89
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_0
    const/4 v0, 0x0

    .line 93
    :goto_0
    const-class v1, Lcom/bumptech/glide/b;

    .line 94
    .line 95
    monitor-enter v1

    .line 96
    :try_start_1
    sget-object v2, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    .line 97
    .line 98
    if-nez v2, :cond_1

    .line 99
    .line 100
    invoke-static {p0, v0}, Lcom/bumptech/glide/b;->a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    monitor-exit v1

    .line 104
    goto :goto_1

    .line 105
    :catchall_0
    move-exception p0

    .line 106
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    throw p0

    .line 108
    :cond_2
    :goto_1
    sget-object p0, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    .line 109
    .line 110
    return-object p0
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method


# virtual methods
.method public final c(Lcom/bumptech/glide/l;)V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot unregister not yet registered manager"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onLowMemory()V
    .locals 3

    .line 1
    sget-object v0, Le2/j;->a:[C

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/bumptech/glide/b;->c:Lm1/h;

    .line 19
    .line 20
    check-cast v0, Le2/g;

    .line 21
    .line 22
    const-wide/16 v1, 0x0

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Le2/g;->e(J)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/bumptech/glide/b;->b:Ll1/d;

    .line 28
    .line 29
    invoke-interface {v0}, Ll1/d;->b()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/bumptech/glide/b;->f:Ll1/b;

    .line 33
    .line 34
    invoke-interface {v0}, Ll1/b;->b()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string v1, "You must call this method on the main thread"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final onTrimMemory(I)V
    .locals 5

    .line 1
    sget-object v0, Le2/j;->a:[C

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-eqz v0, :cond_5

    .line 17
    .line 18
    iget-object v0, p0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 19
    .line 20
    monitor-enter v0

    .line 21
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lcom/bumptech/glide/l;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 44
    iget-object v0, p0, Lcom/bumptech/glide/b;->c:Lm1/h;

    .line 45
    .line 46
    check-cast v0, Lm1/g;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const/16 v1, 0x28

    .line 52
    .line 53
    if-lt p1, v1, :cond_2

    .line 54
    .line 55
    const-wide/16 v1, 0x0

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Le2/g;->e(J)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/16 v1, 0x14

    .line 62
    .line 63
    if-ge p1, v1, :cond_3

    .line 64
    .line 65
    const/16 v1, 0xf

    .line 66
    .line 67
    if-ne p1, v1, :cond_4

    .line 68
    .line 69
    :cond_3
    monitor-enter v0

    .line 70
    :try_start_1
    iget-wide v1, v0, Le2/g;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    monitor-exit v0

    .line 73
    const-wide/16 v3, 0x2

    .line 74
    .line 75
    div-long/2addr v1, v3

    .line 76
    invoke-virtual {v0, v1, v2}, Le2/g;->e(J)V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/bumptech/glide/b;->b:Ll1/d;

    .line 80
    .line 81
    invoke-interface {v0, p1}, Ll1/d;->a(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/bumptech/glide/b;->f:Ll1/b;

    .line 85
    .line 86
    invoke-interface {v0, p1}, Ll1/b;->a(I)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :catchall_0
    move-exception p1

    .line 91
    monitor-exit v0

    .line 92
    throw p1

    .line 93
    :catchall_1
    move-exception p1

    .line 94
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    throw p1

    .line 96
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 97
    .line 98
    const-string v0, "You must call this method on the main thread"

    .line 99
    .line 100
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method
