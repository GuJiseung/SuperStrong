.class public final Lb4/h;
.super Landroidx/lifecycle/f0;
.source "SourceFile"


# instance fields
.field public final d:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ly3/c;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lorg/json/JSONArray;

.field public final f:Ly3/j0;

.field public final g:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Landroidx/lifecycle/f0;-><init>()V

    new-instance v0, Landroidx/lifecycle/s;

    new-instance v9, Ly3/c;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Ly3/c;-><init>(IDDD)V

    invoke-direct {v0, v9}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/h;->d:Landroidx/lifecycle/s;

    new-instance v0, Lorg/json/JSONArray;

    const/4 v1, 0x1

    new-array v2, v1, [Lorg/json/JSONObject;

    new-instance v3, Lorg/json/JSONObject;

    new-instance v4, Lq3/j;

    invoke-direct {v4}, Lq3/j;-><init>()V

    new-instance v5, Ly3/n;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Ly3/n;-><init>(I)V

    invoke-virtual {v4, v5}, Lq3/j;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    aput-object v3, v2, v6

    invoke-direct {v0, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/h;->e:Lorg/json/JSONArray;

    new-instance v0, Ly3/j0;

    invoke-direct {v0}, Ly3/j0;-><init>()V

    iput-object v0, p0, Lb4/h;->f:Ly3/j0;

    new-instance v0, Landroidx/lifecycle/s;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v2}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/h;->g:Landroidx/lifecycle/s;

    new-instance v0, Landroidx/lifecycle/s;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/lifecycle/s;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lb4/h;->h:Landroidx/lifecycle/s;

    return-void
.end method
